/*
 86546
 
 *6
 *46
 *546
 *6546
 *86546
 */
package com.jbk.day7logical;

public class Program6 {
	public static void main(String[] args) {
		int y = 10;
		for (int no = 86546;no%y<=no; y=y*10) {
			System.out.println(no%y);
			if(no%y==no) {
				break;
			}
		}
	}
}
