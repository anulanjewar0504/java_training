// to find out of squareroot of number
package com.jbk.day34revision;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPerfectSquare = true;
        int i = 1;
        while (i * i <= number) {
            if (i * i == number) {
                break;
            }
            i++;
        }

        if (i * i == number) {
            System.out.println(number + " is a perfect square.");
            System.out.println("and the perfect square root is: "+i);
        } else {
            System.out.println(number + " is not a perfect square.");
        }		
	}
}
