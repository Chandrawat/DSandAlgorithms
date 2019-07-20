package com.practise;


class Emp{
	
	int eId;
	int salary;
	static String position;
		
	static {				// when we load a class		// only once called per class
		position = "Software Engineer";
	}
	
	static {					// static block follows sequence , usually we have only one block each class
		position = "CEO";
	}
	
	public Emp() {			// when we create an object of class
		eId= 0;
		salary = 0;
	}
	
	void display() {
		System.out.println("Emoloyee Id is "+eId+ " Salary is "+ salary+" Position is "+ position);
	}
	
}

public class StaticKeyword {
	
	int i= 1;

	public static void main(String[] args) {
		
	//	 i=2;   we can not access non static variable into static method
				// to access i we need to make it static like static int i = 1;
		
		Emp larry = new Emp();
		larry.eId = 101;
		larry.salary= 1000;
	//	Emp.position= "Java Developer";
		larry.display();
		
		Emp lorax = new Emp();
		lorax.eId= 102;
		lorax.salary=2000;
	//	lorax.position= "Java Developer"; 			// change it to Class.
	//	Emp.position= "Java Developer";
		
		lorax.display();
		
		

	}

}
