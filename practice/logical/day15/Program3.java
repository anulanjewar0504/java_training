//Write a program to print the sum factorial of each digit of  number ✔️ 
package com.jbk.practice.logical.day15;

public class Program3 {
	public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1); // recursion.
        }
   }
}
