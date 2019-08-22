package com.collectionApi;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMapBasic {

	public static void main(String[] args) {
		
		System.out.println("\nHash Map\n");
		
		Map<String, String> hs= new HashMap<>();		// not syncronized
		hs.put("Name","Saksham");
		hs.put("College", "Pace");
		hs.put("Place","NY");
		hs.put("Place","NYYY");
		
		Set<String> keys = hs.keySet();
		
		for(String eachKey: keys) {
			System.out.println(eachKey+ "  "+ hs.get(eachKey));
		}
		
		System.out.println("\nHash Table\n");
		
		Map<String, String> ht= new Hashtable<>();	
		ht.put("Name","Saksham");
		ht.put("College", "Pace");
		ht.put("Place","NY");
		ht.put("Place","NYYY");

		Set<String> keysT =ht.keySet();
		
		for(String eachKeyT: keysT) {
			System.out.println(eachKeyT+ "   "+ ht.get(eachKeyT));
		}
		
		

	}

}
