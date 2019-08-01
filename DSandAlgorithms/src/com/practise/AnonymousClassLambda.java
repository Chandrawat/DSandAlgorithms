package com.practise;

/*
 * 3 types of Interfaces:
 * 
 * 1. normal - which has mora than 1 abstract methods
 * 2. Single Abstract Method(SAM)- Called as Functional Interface- Lambda Expression
 * 3. Marker Interface- which as no methods - eg.Serializable Interface
 */

@FunctionalInterface		// optional 
interface DisplayName{
	void show();
}

public class AnonymousClassLambda {

	public static void main(String[] args) {
		
		/* Instead of using this code we can use below one
		 * 
		 * DisplayName dn = new DisplayName() {
		 * 
		 * @Override public void show() {
		 * System.out.println("My name is Saksham Chandrawat"); } };
		 */
		
		
		/*
		 * Lambda Expression only works with Functional Interface
		 * It is similar to function but no return type as compiler will check from the return type and no access modifier as it 
		 * will be same for the variable it will be stored in
		 */
		DisplayName dn = () ->
				System.out.println("My name is Saksham Chandrawat");
		
		dn.show();
		
	}

}
