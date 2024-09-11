package com.jbk.day25collectionmap;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Mapclass {
	public static void main(String[] args) {
		Product p1 = new Product(1, "pen", 10.00);
		Product p5 = new Product(5, "Bike", 100000.00);
		Product p2 = new Product(2, "Book", 30.00);
		Product p3 = new Product(3, "Tab", 30000.00);
		Product p4 = new Product(4, "Mobile", 50000.00);
		Product p6 = new Product(6, "CPU", 3000.00);
		
//		ArrayList<Product>p = new ArrayList<>();
//		p.add(p1);
//		p.add(p2);
//		p.add(p3);
//		p.add(p4);
//		p.add(p5);
//		p.add(p6);
//		
		LinkedHashMap<Integer, Product> p = new LinkedHashMap<>();
		p.put(1,p1);
		p.put(2,p5);
		p.put(3,p3);
		p.put(4,p4);
		p.put(5,p2);
		p.put(6,p6);
		
		p.forEach((k,v)-> System.out.println(k+" "+v));
		
		System.out.println("\n");
		
		TreeMap<Integer, Product> t = new TreeMap<>();
		t.put(1,p1);
		t.put(2,p2);
		t.put(3,p3);
		t.put(4,p4);
		t.put(5,p5);
		t.put(6,p6);
		
		
		p.forEach((k,v)->System.out.println(k+" "+v));
		System.out.println("\n");System.out.println("\n");
		
		Set<Map.Entry<Integer,Product>> entries  = t.entrySet();
		for(Map.Entry<Integer,Product> e: entries) {
			Integer t1 = e.getKey();
			Product pro = e.getValue();
			if(pro.getPrice()>50) {
				System.out.println(pro);
			}
		
		}
		
		
		
	}
}
