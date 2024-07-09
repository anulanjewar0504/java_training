package com.work.constructor;

public class Test1 {
	public static void main(String[] args) {
		Program1 p1 = new Program1 ();
		Program1 p2 = new Program1 (30);
		Program1 p3 = new Program1 (30,25);
		p1.display();
		System.out.println("................................");
		p2.display();
		System.out.println("................................");
		p3.display();
		
	}
}
