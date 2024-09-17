package com.jbk.day30streamapi;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> i  = new ArrayList<>(); 
		i.add(25);
		i.add(36);
		i.add(56);
		i.add(96);
		
		i.stream().forEach(s->System.out.println(s));
		System.out.println("\nGreater than 50:\n");
		i.stream().filter(x->x>50).forEach(s->System.out.println(s));
	}
}
