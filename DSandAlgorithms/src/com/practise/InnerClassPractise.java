package com.practise;


class Outer{
	
	int a;		// member variable
	public void show() {		//member method
		
	}
	
	 class  Inner{				// Creates Outer$Inner.class		// member Class
					// if class is static like class static Inner then no need to use outer class object in main class
		public void display() {
			System.out.println("IN DISPLAY");
		}
	}
}

public class InnerClassPractise {

	public static void main(String[] args) {
		//nkn
		
		Outer outer = new Outer();
		outer.show();
		
	//	Inner inner = new Inner(); 			This will create error as out of scope

	//	Outer.Inner inner 		// we need to use the outer class with inner class name
		Outer.Inner inner  =  outer.new Inner(); //to use object of inner class we need to use object of outer class
												// if inner class is static then it would be new Outer.Inner()
		inner.display();
	
	}

}
