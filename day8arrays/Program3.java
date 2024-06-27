package com.jbk.day8arrays;

public class Program3 {
	public static void main(String[] args) {
		int c[]= {12,36,45,87,98,62,87,32};
		int sum = 0;
		for(int i = 0; i<c.length;i++) {
			sum=sum+c[i];
		}
		System.out.println(sum);
	}
}
