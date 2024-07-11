package com.jbk.practice.logical.day15;

import java.util.Scanner;

public class Mainfact {
	public static void main(String[] args) {
		Program1 f1 = new Program1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find factorial");
		int a = sc.nextInt();
		double fact = f1.factorial(a);
		System.out.println(fact);
	}
}
