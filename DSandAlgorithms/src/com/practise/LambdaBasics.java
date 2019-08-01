package com.practise;

public class LambdaBasics {

	public void greet(GreetingInterface greeting) {
		//System.out.println("Hello World");
		greeting.perform();
	}
	
	
	public static void main(String[] args) {

		LambdaBasics lambdaBasics = new LambdaBasics();
		//lambdaBasics.greet();
		GoodMorningGreeting goodMorningGreeting = new GoodMorningGreeting();
		lambdaBasics.greet(goodMorningGreeting);
		
	}

}
