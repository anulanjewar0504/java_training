//Find factorial ✔️
package com.jbk.practice.logical.day15;

public class Program1 {
	double factorial (double a) {
		double fact =  1;
		for (int i = 1; i<=a; i++) {
			fact = fact*i;
		}
		return fact;  
	}
}
