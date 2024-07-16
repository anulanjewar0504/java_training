package com.jbk.exception_handaling;

public class Nested_Exception1 {
	public static void main(String[] args) {
		try {
			try {
				System.out.println("Inner Block1");
				int b = 45/0;
				System.out.println(b);
			}catch (ArithmeticException e) {
				System.out.println("Exception: e1");
			}
			
			try {
				System.out.println("Inside block2");
			}catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("Just other statement");
			}
		}catch (ArithmeticException e3) {
			System.out.println("Arithmetic Exception");
			System.out.println("Inside parent try catch block");
		}catch (ArrayIndexOutOfBoundsException e3) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("Inside parent try catch block");
		}catch(Exception e5) {
			System.out.println("Exception");
			System.out.println("Inside Parent try catch block");
		}
		System.out.println("Next Statement");
	}
}
