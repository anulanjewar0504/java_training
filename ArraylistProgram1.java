package Collactionday1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArraylistProgram1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Anurag");
		al.add("Om");
		al.add("Pratik");
		al.add("Ram");
		
		System.out.println(al);
		
		for(String s: al) {
			System.out.println(s);
		}
		
		
		
		
		System.out.println();
		System.out.println("Hash Map");
		HashMap<String, Integer> hm =  new HashMap<String, Integer>();
		
		hm.put("A",60);
		hm.put("B", 70);
		hm.put("C", 80);
		
		for(Map.Entry<String, Integer> hm1: hm.entrySet()){
			System.out.print(hm1.getKey()+" ");
			System.out.println(hm1.getValue());
			
		}
	}
}
