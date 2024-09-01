package com.jbk.collection;

import java.util.ArrayList;

public class DeleteElement {
	public static void main(String[] args) {
		ArrayList<Integer> el = new ArrayList<>();
		el.add(1);
		el.add(2);
		el.add(3);
		el.add(0);
		System.out.println("ArrayList Before deletion:"+el);
		el.clear();
		System.out.println("Clear function executed --> "+el);
	}

}
