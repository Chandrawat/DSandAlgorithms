package com.array;

import java.util.ArrayList;

public class CommonInThreeArrays {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7};
		int[] b= {1,3,4,5};
		int[] c= {1,5,8,9};
		int x=0;
		int y = 0;
		int z = 0;
		
		ArrayList<Integer> al = new ArrayList<>();
		
		while(x<a.length && y<b.length && z<c.length) {
			if(a[x] == b[y] && b[y]== c[z]) {
				al.add(a[x]);
				x++;
				y++;
				z++;
			}
			else if(a[x]< b[y]) {
				x++;
			}
			else if(b[y]< c[z]) {
				y++;
			}
			else {
				z++;
			}
		}
		for(int n: al) {
			System.out.print(n+ " ");
		}
		
	}

}
