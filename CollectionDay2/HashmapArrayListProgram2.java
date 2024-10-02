//A- 34 45 67 78
//B- 66 77 88 99
//C- 23 55 62 74

package CollectionDay2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapArrayListProgram2 {
	public static void main(String[] args) {
		ArrayList<Integer> st1 = new ArrayList<Integer>();
		st1.add(34);
		st1.add(45);
		st1.add(67);
		st1.add(78);
	HashMap<String, ArrayList<Integer>> hm1 = new HashMap <String, ArrayList<Integer>>();
	hm1.put("Anurag", st1);
	
	ArrayList<Integer> st2 = new ArrayList<Integer>();
		st2.add(66);
		st2.add(77);
		st2.add(88);
		st2.add(99);
	HashMap<String, ArrayList<Integer>> hm2 = new HashMap <String, ArrayList<Integer>>();
	hm2.put("Boss", st2);
	

	ArrayList<Integer> st3 = new ArrayList<Integer>();
		st3.add(23);
		st3.add(55);
		st3.add(62);
		st3.add(74);
	HashMap<String, ArrayList<Integer>> hm3 = new HashMap <String, ArrayList<Integer>>();
	hm3.put("Cira", st3);
	
	for(Map.Entry<String, ArrayList<Integer>> h1:hm1.entrySet()) {
		System.out.print(h1.getKey()+"-");
		System.out.println(h1.getValue())
		;
	}
	for(Map.Entry<String, ArrayList<Integer>> h1:hm2.entrySet()) {
		System.out.print(h1.getKey()+"-");
		System.out.println(h1.getValue())
		;
	}
	for(Map.Entry<String, ArrayList<Integer>> h1:hm3.entrySet()) {
		System.out.print(h1.getKey()+"-");
		System.out.println(h1.getValue())
		;
	}
	
	System.out.println();
	System.out.println();
	
	
//	using set to print number in format
	System.out.println("set");
	Set<String> stname = hm1.keySet();
	
	
	for(String name: stname) {
		
		System.out.print(name+ " - ");
		ArrayList<Integer> std1 = hm1.get(name);
		for(Integer i : std1) {
			System.out.print(i +" ");
		}
		System.out.println();
	}
	
	

	}
}
