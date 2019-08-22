package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>{
	int rollno,marks;
	String name;
	
	
	public Stud(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Stud s) {
		return rollno>s.rollno?1:-1;
	}	
}

public class ComparableImpl {

	public static void main(String[] args) {
		
		List<Stud> studs = new ArrayList<>();

		studs.add(new Stud(23, "John", 55));
		studs.add(new Stud(24, "Alex", 25));
		studs.add(new Stud(27, "Robin", 15));
		studs.add(new Stud(29, "Ajax", 50));
		
		// for sort
		Collections.sort(studs);
		
		
		
		
		for (Stud s: studs) {
			System.out.println(s);
		}
		
		

	}

}
