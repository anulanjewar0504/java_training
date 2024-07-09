//!!!!!!!!
//!*******
//!*******
//!*******
//!*******
package com.jbk.practice.logical;

public class Pattern2 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<8;j++) {
				if((i==0&&j<8)||(i<5&&j==0)) {
					System.out.print("!");
				}
				else {System.out.print("*");}
			}
			System.out.println();
		}

	}

}
