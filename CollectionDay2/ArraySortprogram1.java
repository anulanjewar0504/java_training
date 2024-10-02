//Write a program to sort an ArrayList of Strings alphabetically.
package CollectionDay2;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySortprogram1 {
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<>();
		
		arr1.add("apple");
		arr1.add("banana");
		arr1.add("mango");
		arr1.add("cherry");
		arr1.add("date");
		Collections.sort(arr1);
		
		System.out.println("Sorted list ->"+arr1);
	}

}
