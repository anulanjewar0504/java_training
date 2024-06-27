// print array in reverse order
package com.jbk.day8arrays;

public class Program11 {
	public static void main(String[] args) {
		int a[] = { 5, 4, 8, 7 };
		for (int i = a.length-1; i>=0; --i) {
			System.out.print(a[i]);
		}
	}
}
