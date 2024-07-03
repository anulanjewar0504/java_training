package com.jbk.day11constructor;

public class Program1 {
	public static void main(String[] args) {
		Doctor1 d1 = new Doctor1(20,"Shravani",10,"child specilist");
		Doctor1 d2 = new Doctor1(20,"Shravani","child specilist");
		Doctor1 d3 = new Doctor1();
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}
