package com.array;

public class FindFirstDuplicateArray {

	public static void main(String[] args) {
		
		int[] arr= {6,5,3,25,1,7,4};
		int temp = 0;
		
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					System.out.println("Found First duplicate element: "+ arr[i]);
					temp++;
					break;
				}
			}
			if(temp>0) {
				break;
			}
		}

	}

}
