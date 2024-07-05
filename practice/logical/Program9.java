//print the sum of even number from 15 to 35  
package com.jbk.practice.logical;

public class Program9 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 15; i<=35; i++) {
			if(i%2==0) {
				sum +=i;
			}
		}System.out.println("The sum of even number from 15 to 35 is :- "+sum);
	}
}
