package com.jbk.day5patern;

public class Pattern_11 {
	public static void main(String[] args) {
		for(int i = 1; i<=6;i++) {
			for(int j = 1; j<=6; j++) {
				if((i==1&&j==4)|| (i==1&&j==5)||(i==1&&j==6)||(i==2&&j==4)|| (i==2&&j==5)||(i==2&&j==6)||(i==3&&j==4)|| (i==3&&j==5)||(i==3&&j==6))
					System.out.print("#");
				else if((i==4&&j==1)|| (i==4&&j==2)||(i==4&&j==3)||(i==5&&j==1)|| (i==5&&j==2)||(i==5&&j==3)||(i==6&&j==1)|| (i==6&&j==2)||(i==6&&j==3))
					System.out.print("@");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
