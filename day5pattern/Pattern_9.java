package com.jbk.day5patern;

public class Pattern_9 {
public static void main(String[] args) {
	for(int i = 1; i<=5;i++) {
		for(int j = 1; j<=10; j++) {
			if(j==1||j==2||j==3)
				System.out.print("#");
			else if(j==4||j==5||j==6) 
				System.out.print("@");
			else
				System.out.print("*");
		}
		System.out.println();
	}
}	
}

