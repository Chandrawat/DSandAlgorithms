package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorImp {

	public static void main(String[] args) {
		
		List values = new ArrayList();
		values.add(2004);
		values.add(2002);
		values.add(2003);
		values.add(2001);
		
		//Collections.sort(values);
		
		Comparator<Integer> c = new Comparator<>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1%10>02%10?1:-1;	//ternary operator
				//result = testCondition ? trueValue : falseValue
				
				/*
				 * if(o1%10>o2%10) return 1; else { return -1; }
				 */
			}
		};
		
		Collections.sort(values, c);
		
		
		for(Object o: values) {
			System.out.println(o);
		}

		
		
		
		

	}

}
