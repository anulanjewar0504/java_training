package com.jbk.day12constructor;

public class Student extends Person {
	int roll_number;
	String course;
	
	public Student() {
		super();
	}
	public Student (int roll_number, String course) {
		super();
		this.roll_number = roll_number;
		this.course = course;
	}
	
	public Student (int id, String name, String dob, int roll_number, String course) {
		super(id,name,dob);
		this.roll_number = roll_number;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", course=" + course + "]"+super.toString();
	}

}
