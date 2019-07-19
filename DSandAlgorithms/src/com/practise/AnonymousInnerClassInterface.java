package com.practise;

interface OuterInterface{
	void display();
}

//class B implements OuterInterface{
//	public void display() {
//		System.out.println("Inside Class B");
//	}
//}

public class AnonymousInnerClassInterface {

	public static void main(String[] args) {
		
		OuterInterface b = new OuterInterface() {			// IF we are nit going to use the class more than once we should go for Anonymous Class
			public void display() {
				System.out.println("Inside Class Main");
			}
		};
		b.display();
		
		
	}

}
