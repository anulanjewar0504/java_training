package com.jbk.practice.logical;

public class Program2 {
	public static void main(String[] args) {
		double value = 10000; 
		Length_convertor l1 = new Length_convertor();
		double k = l1.km(value);
		double c = l1.cm(value);
		System.out.println("km = "+k+" || "+"cm = "+c);
		
	}
}
