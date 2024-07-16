package com.jbk.exception_handaling.program2;

public class ExceptionEx1 {
	public static void main(String[] args) {
		int [] array = {1,2};
		try {
		System.out.println("The 10th value of array is: "+array[10]);
		}
		catch(Exception e){
			System.out.println("The Error: "+e);
		}
	}
}
