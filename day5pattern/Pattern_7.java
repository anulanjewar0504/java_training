package com.jbk.day5patern;

public class Pattern_7 {
	public static void main(String[] args) {
		for(int i = 1; i<=5;i++) {
			for(int j = 1; j<=5; j++) {
				if(j==3||j==4||j==5)
					System.out.print("@");
				else 
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
