// Create an arraylist of integers and diaplay all the values in the range of 50 to 100
package com.jbk.day22Java8;

import java.util.ArrayList;


public class Program1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(22);
		al.add(55);
		al.add(70);
		al.add(102);
		
		al.stream().filter(x-> x>50 && x< 100).forEach(x->System.out.println(x));
		
//		Increase the value of each element by 50 and display it
		System.out.println();
		al.stream().map(x-> x+50).forEach(x->System.out.println(x));
		
//		compute addition of all the integers in the arraylist
		System.out.println();
		System.out.println(al.stream().reduce(0,(x,y)->x+y,Integer::sum));		
	}
}