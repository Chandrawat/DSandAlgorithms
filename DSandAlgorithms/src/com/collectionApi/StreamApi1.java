package com.collectionApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamApi1 {

	public static void main(String[] args) {
		
		List<Integer> al =Arrays.asList(1,2,3,4,5,6);
		
		for(int i: al) {
			System.out.println(i);
		}
		
		Iterator its= al.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
		
		
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}

		
	}

}
