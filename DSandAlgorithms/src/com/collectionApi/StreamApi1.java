package com.collectionApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamApi1 {

	public static void main(String[] args) {
		
		List<Integer> al =Arrays.asList(1,2,3,4,5,6);
		
		/*
		 * for(int i: al) { System.out.println(i); }
		 *
		 * Iterator its= al.iterator(); while(its.hasNext()) {
		 * System.out.println(its.next()); }
		 * 
		 * for(int i=0;i<al.size();i++) { System.out.println(al.get(i)); }
		 */
		
		
		/*
		 * Consumer<Integer> c = new Consumer<Integer>() {
		 * 
		 * @Override public void accept(Integer t) {
		 * 
		 * 
		 * System.out.println(t);
		 * 
		 * 
		 * }
		 * 
		 * };
		 */
		
		
		
		//Consumer<Integer> c = (Integer t)-> System.out.println(t);
		
		//Consumer<Integer> c = t-> System.out.println(t);
	
		//functional interface
		//internal iterations
		
		//al.forEach(i -> System.out.println(i));
		
		
		//al.forEach(c);
		
		/*
		 * al.forEach(new Consumer<Integer>() {
		 * 
		 * @Override public void accept(Integer t) {
		 * 
		 * 
		 * System.out.println(t);
		 * 
		 * } });
		 */
		
		//al.forEach(t-> System.out.println(t));
	
	}
}
