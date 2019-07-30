package com.array;

import java.util.ArrayList;
import java.util.Arrays;



public class ArrayMethods {

	public static void main(String[] args) {
			
		// Declaration of array
		String[] aType = new String[5];
		String[] bType = {"a","b","c"};
		String[] cType = new String[] {"a","b","c","d"};
		
		//print an array
		int[] aInt= {1,2,3,4,5};
		String inString = Arrays.toString(aInt);
		System.out.println(inString);

		//Create an ArrayList from array
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(bType));
		System.out.println(arrayList);
		
		//check if array contains certain value
		boolean find = Arrays.asList(bType).contains("b");
		System.out.println(find);
		
		int[] intA1= {1,2,3};
		int[] intA2= {4,5};
		//int[] concatenate = ArrayUtils.
		
		//System.out.println("Hello World");
	}

}
