package com.jbk.practice.logical.day15;

import java.util.Scanner;

public class Maineachdigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Program2 p1 =  new Program2();
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            int fact = p1.factorial(digit);

            System.out.println("Factorial of " + digit + " = " + fact);
            temp /= 10;
	       }
   }
}
