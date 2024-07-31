//print the series of 
//10 20 30 40 50 60 70 500 80 90 100
package com.jbk.practice.logical;

import java.util.Iterator;

public class Logical {
	public static void main(String[] args) {
		for(int i =10; i<=100;i=i+10) {
			if (i==80) {
				System.out.print(500+" ");
			}
			System.out.print(i+" ");
		}
	}
	
}
