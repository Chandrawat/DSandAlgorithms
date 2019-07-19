package com.array;

public class MergeSortImplementation {
	
	int[] arr;
	int[] mergeArray;
	int len;

	public static void main(String[] args) {
		
		int[] inputArray = {10, 40, 50,2,6,1,56};
		
		MergeSortImplementation implementation = new MergeSortImplementation();
		implementation.sort(inputArray);

	}
	
	public void sort(int inputArray[]) {
		this.arr = inputArray;
		this.len = inputArray.length;
		this.mergeArray = new int[len];
		divideArray(0, len-1);
	}

	public void divideArray(int lowerIndex, int UpperIndex) {
		
	}
}
