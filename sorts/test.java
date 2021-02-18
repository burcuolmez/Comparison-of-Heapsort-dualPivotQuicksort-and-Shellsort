package sorts;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ArrayMaker ar= new ArrayMaker(); //creates array
		
		//we should send number of elements
		//int[]array = ar.equal(1000);
		//int[]array = ar.equal(10000);
		//int[]array = ar.equal(100000);
		//int[]array = ar.random(1000);
		//int[]array = ar.random(10000);
		int[]array = ar.random(100000);
		//int[]array = ar.increasing(1000);
		//int[]array = ar.increasing(10000);
		//int[]array = ar.increasing(100000);
		//int[]array = ar.decreasing(1000);
		//int[]array = ar.decreasing(10000);
		//int[]array = ar.decreasing(100000);
		
	    
		SortingClass sc= new SortingClass();
		//System.out.println("before:");
    	//sc.display(array);
    	long startTime = System.nanoTime();
    	sc.heapSort(array);
        //sc.dualPivotQuickSort(array);
  		//sc.shellSort(array);
    	long estimatedTime = System.nanoTime() - startTime;
		//System.out.println("After:");
    	//sc.display(array);
		System.out.println(estimatedTime);
		
	
     	 
		}
		catch(Exception e) {
			System.gc();
		}
	}
	
			
		
	

}
