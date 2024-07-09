
package com.work.constructor;

public class Program1 {
	int value1;
	int value2;
	
	Program1(){
		value1=10;
		value2=20;
		System.out.println("Inside 1st constructor");
	}
	Program1(int a){
		value1  = a;
		System.out.println("Inside 2nd constructor");
	}
	Program1(int a,int b){
		value1  = a;
		value2  = b;
		System.out.println("Inside 2nd constructor");
	}
	public void display() {
		System.out.println("value 1 == "+value1);
		System.out.println("Value 2 == "+value2);
	}
	

}
