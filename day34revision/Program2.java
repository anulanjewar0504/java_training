// Addition of even and odd from array and taking input from user
package com.jbk.day34revision;

import java.util.Scanner;

public class Program2 {

    // Method to calculate sum of even and odd numbers
    public static void sumEvenOdd(int[] arr) {
        int evenSum = 0, oddSum = 0;
        
        for (int num : arr) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    public static void main(String[] args) {
        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        // Taking the size of the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        // Creating the array and taking inputs
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calling the method to calculate the sums
        sumEvenOdd(arr);
        
        sc.close();
    }
}
