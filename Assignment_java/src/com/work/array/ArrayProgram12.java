// copying an array to another 
package com.work.array;

public class ArrayProgram12 {
	public static void main(String[] args) {
		int array1[] = {2,3,4,5,6,7};
		int array2[] = new int [array1.length];
		
		for(int i =0;i<array1.length;i++) {
			array2[i] = array1[i];
		}
		
		for(int i =0;i<array1.length;i++) {
			System.out.print("["+array1[i]+"]");
		}
		
	}
}
