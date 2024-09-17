package com.jbk.day30streamapi;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<Integer> i  = new ArrayList<>(); 
		i.add(25);
		i.add(36);
		i.add(56);
		i.add(96);
		
		i.stream().map(x -> x+10).forEach(s->System.out.println(s));
		System.out.println();
		i.forEach(s->System.out.println(s));
	}
}
