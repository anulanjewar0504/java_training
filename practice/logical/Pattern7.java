//Hello Hello Hello Hello Hi
//Hello Hello Hello Hello Hi 
//Hello Hello Hello Hello Hi 
//Hello Hello Hello Hello Hi 
//Hello Hello Hello Hello Hi

package com.jbk.practice.logical;

public class Pattern7 {
	public static void main(String[] args) {
		for(int i = 0;i<5;i++) {
			for(int j = 0; j<5;j++) {
				if(j==4) {
					System.out.print("Hi ");
				}
				else {
					System.out.print("Hello ");
				}
			}
			System.out.println();
		}
	}
}
