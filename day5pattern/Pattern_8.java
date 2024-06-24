package com.jbk.day5patern;

public class Pattern_8 {
	public static void main(String[] args) {
		for(int i = 1; i<=5;i++) {
			for(int j = 1; j<=5; j++) {
				if(j==1||j==2)
					System.out.print("#");
				else if(j==3||j==4) 
					System.out.print("@");
				else
					System.out.println("*");
			}
			System.out.println();
		}
	}
}
