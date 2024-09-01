// Program to display average of array elements
package com.work.array;

public class ArrayProgram10 {
	public static void main(String[] args) {
		double num[]= {10.1,11.2,12.3,13.4,14.5};
		double result = 0;
		
		int i;
		for(i = 0; i<num.length;i++) {
			result  = result + num[i];
		}
		System.out.println("Avrage is "+ result/num.length);
	}
}
