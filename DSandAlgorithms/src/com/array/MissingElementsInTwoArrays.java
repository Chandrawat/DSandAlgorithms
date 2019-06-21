package com.array;

import java.util.HashSet;

public class MissingElementsInTwoArrays {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,10};
		int []b= {2,5,1,3,1};
		
		HashSet<Integer> hsA = new HashSet<>();
		HashSet<Integer> hsB = new HashSet<>();
		
		/*for(int i=0;i<a.length;i++) {
			hsA.add(a[i]);
		} 
		
		or
		*/
		for(int n:a) {
			hsA.add(n);
		}
		
		for(int n:b)
		{
			hsB.add(n);
		}
		
		for(int n:hsB) {
			if((hsA.add(n))==false) {
				System.out.print(n+ " ");
			}
		}
		
	}

}
