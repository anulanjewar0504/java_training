//reverse the content of array
package com.jbk.day9arraysort;

public class Program1 {
	public static void main(String[] args) {
		int a[] = {12,34,55,12,1,4,54};
		
		for(int i = 0; i<a.length;++i) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("----------------------");
		for(int i=0; i<a.length/2; ++i ) {
			int t = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = t;
		}
		for(int i = 0; i<a.length;++i) {
			System.out.print(a[i]+" ");
		}
	}
}
