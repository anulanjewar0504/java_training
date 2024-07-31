package com.jbk.day17Linkedhashmap;

//import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Linkedhashmap {
	public static void main(String[] args) {
		
		// Create 5 Product objects
		Product product1 = new Product("Product A", 10.99);
		Product product2 = new Product("Product B", 82.99);
		Product product4 = new Product("Product D", 56.99);
		Product product3 = new Product("Product C", 71.49);
		Product product5 = new Product("Product E", 7.99);

		// Create a LinkedHashMap to store products

		TreeMap<String, Product> productMap = new TreeMap<>();

		// Add products to the LinkedHashMap using their names as keys
		productMap.put("Product A", product1);
		productMap.put("Product B", product2);
		productMap.put("Product C", product3);
		productMap.put("Product D", product4);
		productMap.put("Product E", product5);

		// Print the products in insertion order
		for (String key : productMap.keySet()) {
			Product product = productMap.get(key);
			if (product.getPrice() > 50) {
				System.out.println(product.getName() + ", Price: $" + product.getPrice());	
			}
		}
	}
}
