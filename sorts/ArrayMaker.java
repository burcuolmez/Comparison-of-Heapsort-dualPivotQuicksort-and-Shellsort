package sorts;

import java.util.Random;

public class ArrayMaker {

	public int[] equal(int n) {
		Random r = new Random();
		int rand_int = r.nextInt(n); 
		int array[]= new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i]=rand_int;
		}
		return array;
		
	}
	public int[] random(int n) {
		Random r = new Random();
		 
		int array[]= new int[n];
		for (int i = 0; i < array.length; i++) {
			int rand_int = r.nextInt(1000);
			array[i]=rand_int;
		}
		return array;
	}
	public int[] increasing(int n) {
		int array[]= new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i]=i;
			
		}
		return array;
	}
	public int[] decreasing(int n) {
		int array[]= new int[n];
		int val=array.length-1;
		for (int i = 0; i < array.length; i++) {
			array[i]=val;
			val--;
		}
		return array;
	}
	
	
}
