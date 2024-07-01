package com.staticInInterface;

public class StaticMethodClass implements StaticMethodDemo{

	public static void main(String[] args) {
		
		StaticMethodClass obj = new StaticMethodClass();
		
		// obj.  -> will not be available 
		// rather need use Interface itself
		StaticMethodDemo.show1();
		StaticMethodDemo.show2();
		

	}

}
