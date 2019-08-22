package com.practise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1,"Saksham");
		hm.put(2,"Chandrawat");
		hm.put(3,"singh");
		
		Set<Integer> keys = hm.keySet();
		 
		
		for(Integer eachKey: keys) {
			System.out.println(eachKey+"  "+ hm.get(eachKey));
		}
		
		
		Iterator itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> me= (Map.Entry<Integer, String>) itr.next();
			System.out.println(me.getKey()+ "   "+ me.getValue() );
		}

		

	}

}
