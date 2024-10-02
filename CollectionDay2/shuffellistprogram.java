//Write a program to shuffle the elements of an ArrayList.
package CollectionDay2;

import java.util.ArrayList;
import java.util.Collections;

public class shuffellistprogram {
	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList <>();
		i.add(10);
		i.add(20);
		i.add(30);
		i.add(50);
		i.add(60);
		
		System.out.println("Without shuffle: "+i);
		Collections.shuffle(i);
		System.out.println("After shuffle: "+i);
	}

}
