package com.practise;

public class SBuilderSBufferTimeDiff {

	public static void main(String[] args) {
		
		
		StringBuffer sBuffer = new StringBuffer();
		
		long startTime2 = System.currentTimeMillis();
		
		for(int i=0;i<=100000;i++) {
			sBuffer.append("Saksham");
		}
		
		long endTime2 = System.currentTimeMillis();
		
		long netTime2= endTime2 - startTime2;
		
		System.out.println("Buffer "+netTime2);
		
	
		StringBuilder sbuilder = new StringBuilder();
		
		long startTime1 = System.currentTimeMillis();
		
		for(int i=0;i<=100000;i++) {
			sbuilder.append("Saksham");
		}

		long endTime1= System.currentTimeMillis();
		
		long netTime1= endTime1 - startTime1;
		
		System.out.println("Builder "+netTime1);
		
		
		
		

		
	}

}
