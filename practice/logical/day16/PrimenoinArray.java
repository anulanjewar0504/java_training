package com.jbk.practice.logical.day16;

import java.util.Arrays;

public class PrimenoinArray {

	public static int[] findPrimeNumbers(int[] numbers) {
		int count = 0;
		for (int num : numbers) {
			if (isPrime(num)) {
				count++;
			}
		}

		int[] primeNumbers = new int[count];
		int index = 0;
		for (int num : numbers) {
			if (isPrime(num)) {
				primeNumbers[index++] = num;
			}
		}

		return primeNumbers;
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		if (num <= 3) {
			return true;
		}
		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}

		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] numbers = { 52, 78, 23, 14, 5, 1, 412,13,12,11 };

		System.out.println("Prime numbers in the array: " + Arrays.toString(findPrimeNumbers(numbers)));
	}

}