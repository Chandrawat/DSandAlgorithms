package com.practise;

import java.util.HashMap;
import java.util.Scanner;

public class FinalCountWords {

	public static void main(String[] args) {
		
		System.out.println("Type your sentence");
		Scanner sc =new Scanner(System.in);
		String sentence = sc.nextLine();
		
		//String sentence = "Saksham is the best person";
		String[] modify = sentence.split(" ");
		for(String a:modify) {
			System.out.print(" "+a);
		}
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(int i = 0;i< modify.length-1;i++) {
			if(hm.containsKey(modify[i])) {
				int count = hm.get(modify[i]);
				//System.out.println(count);
				hm.put(modify[i],count+1);
			}
			else {
				hm.put(modify[i], 1);
			}
		}
		System.out.println(hm);
	}

}
