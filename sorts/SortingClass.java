package sorts;

public class SortingClass {
	public void heapSort(int array[]) {
		int len= array.length;
		for(int i=len/2-1;i>=0;i--) { //divides array to 2 parts
			maxHeapify(array,len,i); //creates max heap
		}
		for (int i=len-1; i>=0; i--){ 
			int temp = array[0]; //we need no change first and last element
			array[0] = array[i]; 
			array[i] = temp; 
			maxHeapify(array, i, 0); //then we need to build max heap again 
		} 
	}
	public void maxHeapify(int array[],int last_index,int val) {
		 int largest = val;  
	     int left= 2*val + 1;  
	     int right= 2*val + 2; 
	     if (left < last_index && array[left] > array[largest]){
	            largest = left; 
	     }
	     if (right < last_index && array[right] > array[largest]){
	            largest = right; 
	     }
	     if(largest!=val) {
	    	 int temp = array[val];
	    	 array[val]=array[largest];
	    	 array[largest]=temp;
	    	 maxHeapify(array,last_index,largest);
	     }
	}
	public void dualPivotQuickSort(int array[]) {
		dualSort(array,0,array.length-1); //to start quick sort
	}
	public void dualSort(int array[],int lowIndex, int highIndex) {
		if(lowIndex<highIndex) {
			int pivots[];
			pivots=partition(array,lowIndex,highIndex);  
	        int lp, rp;  
	        rp = pivots[1];
	        lp=pivots[0];
	        dualSort(array, lowIndex, lp - 1);  
	        dualSort(array, lp + 1, rp - 1);  
	        dualSort(array, rp + 1, highIndex);  
		}
	}
	static int[] partition(int arr[],int low,int high) 
	{ 
		if(arr[low]>arr[high]) {
			int temp=arr[high];
			arr[high]=arr[low];
			arr[low]=temp;
		}
		int afterLp=low+1; //j
		int beforeRp= high-1; //g
		int pointer=low+1; //k
		int lp=arr[low];
		int rp=arr[high];
		while(pointer<=beforeRp) {
			if(arr[pointer]<lp) {
				int temp = arr[afterLp];
				arr[afterLp]=arr[pointer];
				arr[pointer]=temp;
				afterLp++;
			}
			else if(arr[pointer]>= rp) {
				while(arr[beforeRp]>rp && pointer<beforeRp) {
					beforeRp--;
				}
				int temp =arr[beforeRp];
				arr[beforeRp]=arr[pointer];
				arr[pointer]=temp; 
				beforeRp--;  
		        if (arr[pointer] < lp) 
		        {  
		         int temp1 = arr[afterLp];
		         arr[afterLp]=arr[pointer];
		         arr[pointer]=temp1;  
		         afterLp++;  
		        }  
			}
			pointer++;
		}

		afterLp--;
		beforeRp++;
		int temp=arr[afterLp];
		arr[afterLp]=arr[low];
		arr[low]=temp;
		temp=arr[beforeRp];
		arr[beforeRp]=arr[high];
		arr[high]=temp;
		
		int array[]=new int[2];
		array[0]=afterLp;
		array[1]=beforeRp;
		
	    return array;
	       
	} 
	public void shellSort(int arr[]) {
		 int n = arr.length; 
	     for (int gap = n/2; gap > 0; gap=gap/2){ 
	    	for (int i = gap; i < n; i ++){       
	              int temp = arr[i]; 
	              int j; 
	              for (j = i; j >= gap && arr[j - gap] > temp; j =j-gap) 
	                   arr[j] = arr[j - gap]; 
	              arr[j] = temp; 
	         } 
	      } 
	}
	public void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	
}
