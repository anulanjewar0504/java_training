package com.jbk.exception_handaling.program1;

public class TryCatchEx1 {
	public static void main(String args[]) {
		int num1 , num2;
		try {
			num1 =0;
			num2 = 62/num1;
			System.out.println("Try block message");
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Error: Dont divide a number by zero");
		}
	}

}
