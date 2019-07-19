package com.practise;

class A{
	public void show() {
		System.out.println("I am old");
	}
}
/*class B extends A{
	public void show() {
		System.out.println("I am new");
	}
}  */

/*
 * If intension of Class is one time use we can create anonymous class
 * 
 */

public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		A a = new A() {
			public void show() {
				System.out.println("I am new");
			}
		};
		a.show();

	}

}
