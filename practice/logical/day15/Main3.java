package com.jbk.practice.logical.day15;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Program2 p1 =  new Program2();
		int digit = 0 ;
		int fact = 0 ;
		int total =0;
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int temp = number;
        while (temp > 0) {
            digit = temp % 10;
            fact = p1.factorial(digit);
            total  += fact;
     
            temp /= 10;
	       }
        System.out.println("Addition of factorial of each digit is "+total);
	}

}
