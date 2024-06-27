// find the smallest number in array
package com.jbk.day8arrays;

public class Program10 {
	public static void main(String[] args) {
		int a[]= {5,4,8,7};
		int b=a[0];
		for(int i = 0; i<a.length;i++) {
			if(b>a[i]) {
				b=a[i];
			}
		}System.out.println(b);
	}
}
