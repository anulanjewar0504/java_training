//Write a program to show factorial of each digit of number 
package com.jbk.practice.logical.day15;

public class Program2 {
	public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1); // recursion.
        } 
   }
}
