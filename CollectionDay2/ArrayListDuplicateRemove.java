//Write a program to remove all duplicate elements from an ArrayList.
package CollectionDay2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListDuplicateRemove {
	public static void main(String[] args) {
		ArrayList<Integer> r1 = new ArrayList<>();
		r1.add(10);
		r1.add(7);
		r1.add(10);
		r1.add(20);
		r1.add(20);
		
		Set<Integer> unique = new HashSet<>(r1); 
		
		unique.forEach((s)->System.out.print(s+" "));
		
		
	}
}
