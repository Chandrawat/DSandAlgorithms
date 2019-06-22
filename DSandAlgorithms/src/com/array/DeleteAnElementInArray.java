package com.array;

public class DeleteAnElementInArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7};
		int del_el = 1;
		int flag=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == del_el) {
				for(int j=i;j<a.length-1;j++) {
					a[j]= a[j+1];
					flag++;
				}
				break;
			}
		}
		if(flag == 0) {
			System.out.println("The value is not found " + del_el);
		}
		else {
			System.out.println("The item deleted successfully ");
			for(int i=0;i<a.length-1;i++) {
				System.out.print(a[i] + " ");
			}
				
		}
		
	}

}
