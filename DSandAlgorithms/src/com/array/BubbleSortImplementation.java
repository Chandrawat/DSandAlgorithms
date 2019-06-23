package com.array;

public class BubbleSortImplementation {

	public static void main(String[] args) {

		int[] a= {36,19,29,12,5,0,3,40,34,23};
		int flag;
		int temp;

		for(int i=0;i<a.length;i++) {				//This loop is for each cycle/round
			//flag=0;
			
			for(int j=0;j<a.length-1;j++) {		// swapping of numbers
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]= a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
//		for(int n=0;n<a.length;n++) {
//			System.out.print(a[n]+ "  ");
//		}
		for(int n: a) {
			System.out.print(n + " ");
		}
		
	}

}
