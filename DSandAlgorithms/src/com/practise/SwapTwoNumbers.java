package com.practise;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, temp;
		System.out.println("Enter x and y");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		System.out.println("Before Swapping " + "x is "+x +" and y is " +y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swapping " + "x is "+x +" and y is " +y);
		
	}

}
