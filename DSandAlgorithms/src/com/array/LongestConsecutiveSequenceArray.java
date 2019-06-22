package com.array;

import java.util.HashSet;

public class LongestConsecutiveSequenceArray {

	public static void main(String[] args) {

		int[] a = {3,9,10,12,13,1,10,4,11,2};
		int long_len= 0;


		HashSet<Integer> hs = new HashSet<>();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		for(int i=0;i<a.length;i++) {
			if(!hs.contains(a[i]-1)) {
				int currentNumb = a[i];

				while(hs.contains(currentNumb)) {
					
					currentNumb++;
				}
				if(long_len<currentNumb-a[i]) {
				
					long_len = currentNumb-a[i];
				}
			}
		}
		System.out.println("The longest length of consecutive number is : "+ long_len);		//1,2,3,4
	}

}
