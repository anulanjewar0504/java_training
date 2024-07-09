package com.jbk.practice.logical;

import java.util.Scanner;

public class Printtable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print table");
		int a = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(a+"*"+i+" = "+a*i);
		}
			
	}
}
