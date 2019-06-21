package com.array;

import java.util.ArrayList;

public class GetEvenOddInArray {
	
	  public static void main(String[] args) {
		  
		  int []arr= {8,5,10,12,3,1,4};
		  int evenSum = 0, oddSum = 0;
		  
		  ArrayList<Integer> evenArrayList= new ArrayList<>();
		  ArrayList<Integer> oddArrayList= new ArrayList<>();

		  for(int i=0;i<arr.length;i++) {
			  if(arr[i]%2 == 0) {
				  evenArrayList.add(arr[i]);
			  }
			  else {
				  oddArrayList.add(arr[i]);
			  }
		  }
		  System.out.println("Even numbers are: ");
		  for(int evenNo:evenArrayList) {
			  System.out.print(evenNo+ " ");
			  evenSum = evenSum +evenNo;
		  }
		  System.out.print("\n");
		  System.out.println("Total size of even is:"+ evenArrayList.size());
		  
		  
		  
		  System.out.println("Odd numbers are: ");
		  for(int oddNo: oddArrayList) {
			  System.out.print(oddNo+ " ");
			  oddSum = oddSum +oddNo;
		  }
		  System.out.print("\n");
		  System.out.println("Total size of odd is:"+ oddArrayList.size());
		  
		  
		  
		  System.out.println("Sum of even is: "+ oddSum + "and Sum of Even is "+ evenSum);
		  
	  }
}
