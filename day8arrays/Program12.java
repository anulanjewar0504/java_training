//Add 5 in the every element of array
package com.jbk.day8arrays;

public class Program12 {
	public static void main(String[] args) {
		int a[]= {5,4,8,7};
		for(int i = 0 ; i<a.length; ++i) {
			a[i] = a[i]+5;
		}
		for(int i = 0 ; i<a.length; ++i) {
			System.out.println(a[i]);
		}
	}
}
