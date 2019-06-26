package com.array;

public class SelectionSortImplementation {

	public static void main(String[] args) {
		

		int[] a= {3,14,23,56,32,21,40,50,7};
		//String[] a= {"a", "v","x","g","b","c"};
		int minValue;
		int temp= 0;
		//String temp= "";
		
		for(int i=0;i<a.length;i++) {				// for each round/cycle
			minValue=i;								// saving the value of i
			System.out.println();
			for(int j=i+1;j<a.length;j++) {			// start to compare the element from next till last
				if(a[j]<a[minValue]) {				// if any small value found it keep of replacing the value till smallest value in list
		
			//	System.out.print("  "+a[j].compareTo(a[minValue]));	
			//	if(a[j].compareTo(a[minValue]) <0) {
					minValue=j;
				}
			}
			temp = a[i];							// once least value found it will swap the value of a[i] to minimum value in current
			a[i] = a[minValue];
			a[minValue]= temp;
			
		}
		for(int n:a) {
		//for(String n:a) {
			
			System.out.print(n+ "  ");
		}

	}

}
