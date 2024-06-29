// take a input from user in array and perform addition operation on it
package com.jbk.day8arrays;

import java.util.Scanner;

public class Program15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a[] = new int [5];
		System.out.println("Enter the number to add in array");
		
		//get values in array
		for(int i=0; i<a.length;i++) {
			a[i]= sc.nextInt();
		}		
		
		//print values of the array
		System.out.println("Entered array values are");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		

	}
}
