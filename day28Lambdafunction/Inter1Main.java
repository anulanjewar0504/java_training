//Java 8 update 
//lambda function wuth functional interface

package com.jbk.day28Lambdafunction;

public class Inter1Main {
	public static void main(String[] args) {
		Inter1 obj;
		
		
		obj = (a,b)-> a+b;
		System.out.println(obj.op(5, 10));
		obj = (a,b)-> a*b;
		System.out.println(obj.op(5, 10));
		obj = (a,b)-> a%b;
		System.out.println(obj.op(5, 10));
		obj = (a,b)-> a/b;
		System.out.println(obj.op(5, 10));
		
	}
}
