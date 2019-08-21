package com.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class IteratorImplementation {

	public static void main(String[] args) {

		Collection values = new ArrayList();
		values.add(1);
		values.add(2);
		values.add(3);

		
		List ls= new ArrayList();
		ls.add(1);
		ls.add(2);
		ls.add("abc");
		ls.add(2,3);
		
		List<Integer> lsGeneric = new ArrayList<>();
		
		lsGeneric.add(9);
		lsGeneric.add(7);
		lsGeneric.add(4);
		lsGeneric.add(10);
		Collections.sort(lsGeneric);
		
		//or
		
		Collections.reverse(lsGeneric);
		
		for(Object o:lsGeneric) {
			System.out.println(o);
		}
		
		
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}

		
		for(Object o: values) {
			System.out.println(o);
		}
		
		System.out.println(values);

		Iterator it = values.iterator();
		
		Iterator lsIterator= values.iterator();
		while(lsIterator.hasNext()) {
			System.out.println(lsIterator.next());
		}

		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());

		
		  while(it.hasNext()) {
		  System.out.println(it.next());
		  }
		 

	}

}
