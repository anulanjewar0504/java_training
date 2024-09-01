//lets check both the arrays are same or not 
package com.work.array;

public class ArrayProgram4 {
	public static void main(String[] args) {
		char a[] = {'a','b','c','d'};
		char b[] = {'d','c','b','a'};
		
		if(a==b) {
			System.out.println("Both the array are same");
		}
		else {
			System.out.println("Both the array are not same");
		}
	}
}
