package com.jbk.practice.logical;

import java.util.Scanner;

public class Program11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Three number to check gretest number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		Maxfinder11 check1 = new Maxfinder11();
		System.out.println("The gretest number is ==> "+check1.max(a, b, c));
		
	}
}
