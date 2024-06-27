//add all the integer which are less than 0 from array
package com.jbk.day8arrays;

public class Program4 {
	public static void main(String[] args) {
		int a[] =  new int[5];
		
		a[0]= 67;
		a[1]= -34;
		a[2]= 123;
		a[3]= -23;
		a[4]= -2;
		int sum =0;
		for(int i=0; i<a.length; i++) {
			if(a[i]<0) {
				sum = sum+a[i];
			}
		}
		System.out.println(sum);
	}

}
