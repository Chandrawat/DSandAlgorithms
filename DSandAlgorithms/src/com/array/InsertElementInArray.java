package com.array;

public class InsertElementInArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		
		int position= 3;	//it is 3rd position not Index value, index value would be 2. 
		int index_position= 2;
		int value = 100;
		
		for(int i=(a.length-1); i>position-1;i--) {		// for index_position, i>index_position
			a[i] = a[i-1];
		}
		a[position-1]= value;						 	//  a[index_position]
		
		
		/*
		 * for(int i=0;i<a.length;i++) { System.out.print(a[i]+ " "); }
		 */
		
		for(int n: a) {
			System.out.print(n+ " ");
		}
	}

}
