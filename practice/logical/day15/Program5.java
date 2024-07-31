package com.jbk.practice.logical.day15;

public class Program5 {
	void cal(int a) {
		int temp = a;
		double p = 0;
		int digit;
		
        while (temp > 0) {
        	digit = temp % 10;
            System.out.print(digit+">> ");
            p = Math.pow(digit, 4);
            System.out.print(p+" || ");
            temp /= 10;
        }
	}
}
