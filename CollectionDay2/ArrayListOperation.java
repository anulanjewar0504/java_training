//Create a LinkedList and perform various operations like add, remove, and iterate over it.
package CollectionDay2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArrayListOperation {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(1);
		al2.add(2);
		al2.add(10);
		
		
		System.out.println("Complete ArrayList: "+al1);
		
		al1.remove(1); //Remove at index 2 of al1
		System.out.println("After removing element at index 1: "+al1);
		
		al1.retainAll(al2);
		System.out.println("Intersection of two ArrayLists: " + al1);
		
		
		
	}

}
