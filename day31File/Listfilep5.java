package com.jbk.day31File;

import java.io.File;

public class Listfilep5 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\anura\\eclipse-workspace\\JBK\\src\\com\\jbk\\day31File\\Generated text file");
		String [] s = file.list();
		
		//Enhance for loop.
		for(String t:s) {
			System.out.println(t);
		}
	}
}
