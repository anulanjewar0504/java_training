package com.work.constructor;

public class Test3 {
	public static void main(String[] args) {
		Program3 p1 = new Program3();
		
		System.out.println("Student Name is: "+ p1.getName());
		System.out.println("Student Age is: "+ p1.getAge());
		System.out.println("Student id : "+ p1.getSid());
		
		Program3 p2 = new Program3(333,"new",20);
		System.out.println("Student Name is: "+ p2.getName());
		System.out.println("Student Age is: "+ p2.getAge());
		System.out.println("Student id : "+ p2.getSid());
		
	}

}
