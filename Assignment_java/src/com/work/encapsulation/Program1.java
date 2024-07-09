//Fields to calculate area
package com.work.encapsulation;

public class Program1 {
	int length;
	int bredth;
	
	//constructor to initialize value
	Program1(int length, int bredth){
		this.length = length;
		this.bredth = bredth;
	}
	//method to calculate area
	public void getArea() {
		int area = length*bredth;
		System.out.println("Area -->"+area);
	}
}
