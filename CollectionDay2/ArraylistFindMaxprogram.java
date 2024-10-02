//Write a program to find the maximum element from an ArrayList of Integers.
package CollectionDay2;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistFindMaxprogram {
	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<>();
		
		ar1.add(10);
		ar1.add(90);
		ar1.add(7);
		ar1.add(150);
		
		int max = Collections.max(ar1);
		System.out.println(max);
		
		Collections.sort(ar1);
		ar1.forEach((s)->System.out.print(s + " "));
	}
}
