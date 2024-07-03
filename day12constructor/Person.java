package com.jbk.day12constructor;

public class Person {
	int id ;
	String name;
	String dob;
	public Person(){
		super();
	}
	public Person(int id, String name, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	
	

}
