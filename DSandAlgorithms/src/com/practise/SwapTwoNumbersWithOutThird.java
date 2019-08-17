package com.practise;

import java.util.Scanner;

public class SwapTwoNumbersWithOutThird {

	public static void main(String[] args) {
		
		int x,y;
		
		System.out.println("Enter Values of X and Y ");
		Scanner in = new Scanner(System.in);
		x= in.nextInt();
		y= in.nextInt();
		
		System.out.println("Before Swapping " + "x is "+x +" and y is "+y);
		
		x= x+y;
		y=x-y;
		x=x-y;

		System.out.println("Before Swapping " + "x is "+x +" and y is "+y);

	}

}
