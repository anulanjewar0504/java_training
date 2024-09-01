package com.jbk.collection;

import java.util.ArrayList;
import java.util.List;

public class ReadArraylist {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Frist");
		arr.add("Second");
		arr.add("Third");
		arr.add("Random");
		System.out.println("Before actual arraylist: "+arr);
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("tow");
		arr.addAll(list);
		System.out.println("Arraylist + List =: "+arr);
	}

}
