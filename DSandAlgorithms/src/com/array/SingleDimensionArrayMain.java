package com.array;

public class SingleDimensionArrayMain {

	public static void main(String[] args) {
		
		SingleDimensionArray singleDimensionArray = new SingleDimensionArray(5);
		singleDimensionArray.traverseArray();

		System.out.println("\n Values after insertion:");
		singleDimensionArray.insertValueInArray(0, 10);
		singleDimensionArray.insertValueInArray(1, 20);
		singleDimensionArray.insertValueInArray(2, 30);
		singleDimensionArray.insertValueInArray(3, 40);
		singleDimensionArray.insertValueInArray(4, 50);
		

		singleDimensionArray.traverseArray();
		System.out.print("\n The value at 	Third place");
		singleDimensionArray.accessCell(2);
		
		singleDimensionArray.searchElement(40);
		
		System.out.println("Deleting the value of 20");
		singleDimensionArray.deleteElementInArray(20);
		singleDimensionArray.traverseArray();
		
		System.out.println("Delete whole array");
		singleDimensionArray.deleteArray();
		
		
	}

}
