package com.array;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		int[] a = {1,1,2,4,5,6,7,2,3,4,5,6,7};
		
		HashSet<Integer> hs= new HashSet<>();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		for(int n: hs) {
			System.out.print(n+ " ");
		}

	}

}
