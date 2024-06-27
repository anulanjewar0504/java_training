package com.jbk.day8arrays;


public class Program5 {
	public static void main(String[] args) {
		int a [] = new int [9];
		a[0] = 12; 
	    a[1] = 56; 
	    a[2] = 2;
	    a[3] = 42;
	    a[4] = 65;
	    a[5] = 72;
	    a[6] = 32;
	    a[7] = 13;
	    a[8] = 51;

	    int sum = 0;
	    for(int i = 0; i<a.length; i++) {
	    	if(a[i]%3 ==0) {
	    		sum = sum+a[i];
	    	}
	    }System.out.println(sum);
	}
}
