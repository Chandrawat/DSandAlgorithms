package com.array;

import java.util.HashSet;

public class SimilarElementsInArray {

	public static void main(String[] args) {
		
		int []arr1 = {1,2,3,4,5,4};
		int []arr2= {5,4,8,3,1};
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					hs.add(arr1[i]);
					break;
				}
			}
		}
		for(int n:hs) {
			System.out.print(n+" ");
		}
		

	}

}
