package com.array;

public class InsertionSortImplementation {

	public static void main(String[] args) {
		
		int[] a= {5,1,6,2,4,3};
		
		int temp,j;
		
		for(int i=1;i<a.length;i++) {			//starts from second element
			
			temp=a[i];							// Taking each value from array- starts from second till last
			j=i;								// preserve value of i in j
			
			while(j>0 && a[j-1]>temp) {			// from that element till first index element  and  
												// compare the current element with its left most element first then second left and it follows
				a[j]=a[j-1];					// if left side is greater than current element then value 
				j=j-1;							// once it is 0 it will stop
			}
			a[j]=temp;							// for first j=0 so a[0] will give 1 in first position 
		}
		for(int n:a)
		{
			System.out.print(" "+n);
		}
		
	}

}
