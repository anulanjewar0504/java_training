package com.jbk.day31File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile1 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\anura\\eclipse-workspace\\JBK\\src\\com\\jbk\\day31File\\Generated text file\\file1.txt");
		
		FileInputStream fis = new FileInputStream(file);
		byte b[] = fis.readAllBytes();
		fis.close();
		
		String s = new String(b);
		System.out.println(s);
		
	}
}
