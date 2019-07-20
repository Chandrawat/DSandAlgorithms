package com.practise;


class A1{
	
	static A1 a1 = new A1();
	private A1(){
		
	}
	public static A1 getInstance() {
		return a1;
		
	}
	void display() {
		System.out.println("Singleton Class");
	}
	
}


public class SingletonDesign {

	public static void main(String[] args) {
		
	//	A1 abc = new A1();				// Can not create as Constructor is private
		A1 abc = A1.getInstance();		// one single instance will be created 
		A1 bcd= A1.getInstance();
		abc.display();
	}

}
