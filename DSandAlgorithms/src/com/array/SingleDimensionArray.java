package com.array;

public class SingleDimensionArray {
	
	int arr[] = null;
	
	public SingleDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for(int i=0; i<sizeOfArray; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	public void traverseArray() {
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ "	");
		}
		System.out.println(" ");
	}
	
	public void insertValueInArray(int location, int value) {
		
		if(arr[location] == Integer.MIN_VALUE) {
			arr[location] = value;  
			
		}
		
		else {
			System.out.println("Value is already present");
		}
	}
	public void accessCell(int location) {
		if(arr[location] == Integer.MIN_VALUE) {
			System.out.println("The value is blank");
		}
		else {
			System.out.println("\t The value at" + location + "is => "+arr[location]);
		}
	}
	
	public void searchElement(int value) {
		for(int i=0;i<arr.length; i++) {
			if(arr[i] == value) {
				System.out.println("The value " + value + " is present at " + arr[i]);
				return;
			}
		}
		System.out.println("This value "+ value + " is not present");
	}
	
	public void deleteElementInArray(int value) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == value) {
				arr[i] = Integer.MIN_VALUE;
				return;
			}
		}
		System.out.println("The value is not present in array");
	}
	
	public void deleteArray() {
		arr = null ;
		System.out.println("The array is deleted!");
	}
}
