// Java Program that create 3D array
package com.work.array;

public class ArrayProgram11 {
	public static void main(String[] args) {
		byte [][][] space = new  byte[3][3][3];
		space [0][0][0] = 10;
		space [1][1][1] = 20;
		space [2][2][2] = 30;
		
		System.out.println(space [0][0][0]);
		System.out.println(space [1][1][1]);
		System.out.println(space [2][2][2]);
		
	}

}
