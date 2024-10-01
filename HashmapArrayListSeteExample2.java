package Collactionday1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashmapArrayListSeteExample2 {
	public static void main(String[] args) {

		ArrayList<String> alMH = new ArrayList<String>();
		alMH.add("Pune");
		alMH.add("Mumbai");
		alMH.add("Nashik");

		ArrayList<String> alGJ = new ArrayList<String>();
		alGJ.add("Rajkot");
		alGJ.add("Surat");
		alGJ.add("Ahamadabad");

		ArrayList<String> alKNT = new ArrayList<String>();
		alKNT.add("Banglore");
		alKNT.add("Hubali");
		alKNT.add("Maysore");

		HashMap<String, ArrayList<String>> st1 = new HashMap<String, ArrayList<String>>();
		st1.put("Maharashtra", alMH);

		HashMap<String, ArrayList<String>> st2 = new HashMap<String, ArrayList<String>>();
		st2.put("Gujrat", alGJ);

		HashMap<String, ArrayList<String>> st3 = new HashMap<String, ArrayList<String>>();
		st3.put("Karnatak", alKNT);

		ArrayList<HashMap<String, ArrayList<String>>> india = new ArrayList<HashMap<String, ArrayList<String>>>();
		india.add(st1);
		india.add(st2);
		india.add(st3);

		HashMap<String, ArrayList<HashMap<String, ArrayList<String>>>> g1 = new HashMap<String, ArrayList<HashMap<String, ArrayList<String>>>>();

		g1.put("India", india);

//		Set<String> stname3 = g1.keySet();
//		for(String name: stname3) {
//			
//			System.out.print(name+ " -> ");
//			ArrayList<String> std1 = india.get(name);
//			for(String i : std1) {
//				System.out.print(i +" ");
//			}
//			System.out.println();
//		}

		Set<String> cont = g1.keySet();
		for(String name :cont) {
			System.out.println(name+ " - ");
			ArrayList<HashMap<String, ArrayList<String>>> statename = g1.get(name);
			
				for(HashMap<String, ArrayList<String>> i : statename) {
					System.out.println(i +" ");
				}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("for removing brackets");
		System.out.println("--");

		Set<String> cont1 = g1.keySet();
		for (String name : cont1) {
			System.out.println(name + " - ");

			for (HashMap<String, ArrayList<String>> stateMap : india) {
				System.out.println(" State: " + stateMap.keySet().iterator().next());
				
				for (String city : stateMap.values().iterator().next()) {
					System.out.println("   City: " + city);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
