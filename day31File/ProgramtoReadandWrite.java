package com.jbk.day31File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProgramtoReadandWrite {
	public static void main(String[] args) throws IOException {
		String s1 = "GOODMORNING.txt";
		String s = "Good Morning Dear Developer"+System.lineSeparator()+"It's Time to code";
		byte [] b = s.getBytes();
		
		File file = new File(s1);
		
		FileOutputStream fos = new FileOutputStream(file);
		
		fos.write(b);
		fos.close();
		
		FileInputStream fis = new FileInputStream(file);
		byte [] c = fis.readAllBytes();
		String d = new String (c);
		System.out.println(d);
		fis.close();
		
	}
}
