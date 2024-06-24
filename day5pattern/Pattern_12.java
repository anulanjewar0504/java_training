package com.jbk.day5patern;

public class Pattern_12 {
	public static void main(String[] args) {
		for(int i = 1; i<=5;i++) {
			for(int j = 1; j<=6; j++) {
				if((i==3&&j==1)|| (i==3&&j==2)||(i==3&&j==3)||(i==3&&j==4)|| (i==4&&j==1)|| (i==4&&j==2)||(i==4&&j==3)||(i==4&&j==4)||(i==5&&j==1)|| (i==5&&j==2)||(i==5&&j==3)||(i==5&&j==4))
					System.out.print("$");
				else if((i==3&&j==5)||(i==3&&j==6)|| (i==5&&j==6)||(i==4&&j==5)|| (i==4&&j==6)|| (i==5&&j==5)||(i==5&&j==6)||(i==6&&j==5)|| (i==6&&j==6))
					System.out.print("@");
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}
}
