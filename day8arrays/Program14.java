package com.jbk.day8arrays;

public class Program14 {
	public static void main(String[] args) {
		float a [] = {1.2f,5.2f,22.5f,45.2f,56.4f};
		float sum;
		float sum2=0;
		float sum3 = 0;
		
		//Increase the value of each element by 5.5
		System.out.println("after adding 5.5");
		for(int i= 0 ; i<a.length; i++) {
			sum = a[i]+5.5f;
			System.out.println(sum);
		}
		
		
		//calculate the sum of all element which are greater than 20
		System.out.println("Sum of all element which are greater than 20");
		for(int i= 0 ; i<a.length; i++) {
			if(a[i]>20.0f) {
				sum2 = sum2+a[i];
			}
		}
		System.out.println("-->"+sum2);
		
		
		//display the sum of all element of the float array
		System.out.println("The sum of all element of the float aray");
		
		for(int i=0;i<a.length;i++) {
			sum3 = sum3+a[i];
		}
		System.out.println("-->"+sum3);
		
		//count the number of element which are in  the range of 30 to 50 
		int count =0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>30&&a[i]<50) {
				++count;
			}
		}System.out.println("the count is --> "+count);
		

	}
}
