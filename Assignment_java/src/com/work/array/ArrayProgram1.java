package com.work.array;

public class ArrayProgram1 {
	public static void main(String[] args) {
		int a[] = {0,1,2,3,4}; // decelaration type 1
		int b[] = new int [5]; //deceleration type 2
		// insert value int array b;
		b[0] = 4;
		b[1] = 3;
		b[2] = 2;
		b[3] = 1;
		b[4] = 0;
		
//		lets print the value of array a
		for(int i =0; i<a.length;i++) {
			System.out.print(" a.["+a[i]+"]");
		}
		System.out.println();
		
//		lets print the value of array b
		for(int i =0; i<b.length;i++) {
			System.out.print(" b.["+b[i]+"]");
		}
		
		
	}
}
