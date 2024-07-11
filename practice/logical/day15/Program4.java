//Nevin number is or not ✔️
package com.jbk.practice.logical.day15;

public class Program4 {

	
	void nevin() {
		int a = 5;
		int b =a;
		int reversedNum = 0;
		int g = 0;

		for (; b != 0; b /= 10) {
			int f = reversedNum * 10 + b % 10;
			g +=f;
		}
		if (a%g == 0) {
			System.out.println("it is a nevin number ");
		}
		else {
			System.out.println("it is not nevin number ");
		}
	}
}
