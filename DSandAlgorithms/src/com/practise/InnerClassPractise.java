package com.practise;


class Outer{
	
	int a;		// member variable
	public void show() {		//member method
		
	}
	
	class Inner{				// member Class
		public void display() {
			System.out.println("IN DISPLAY");
		}
	}
}

public class InnerClassPractise {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.show();
		
	//	Inner inner = new Inner(); 			This will create error as out of scope

	//	Outer.Inner inner 		// we need to use the outer class with inner class name
		Outer.Inner inner  =  outer.new Inner(); //to use object of inner class we need to use object of outer class
		
		inner.display();
	
	}

}
