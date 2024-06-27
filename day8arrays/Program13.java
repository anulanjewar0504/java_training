// make a copy of array
package com.jbk.day8arrays;

public class Program13 {
	public static void main(String[] args) {
		int a[] = {5,7,6,11,88};
		int b[] = new int[a.length];
		int c[] = new int[a.length];
		for(int i =0;i<a.length;i++) {
			b[i] = c[i] = a[i];
		}
		for(int i =0;i<a.length;i++) {
			System.out.print("a ["+a[i]+"]");
		}
		System.out.println();
		for(int i =0;i<b.length;i++) {
			System.out.print("b ["+b[i]+"]");
		}System.out.println();
		for(int i =0;i<c.length;i++) {
			System.out.print("c ["+c[i]+"]");
		}
		

	}
}
