package com.jbk.day31File;

import java.io.File;

public class FileProfram3 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\anura\\eclipse-workspace\\JBK\\src\\com\\jbk\\day31File\\Generated text file\\file1.txt");
		if(f.delete()) {
			System.out.println("file deleted");
		}else {
			System.err.println("Error");  
		}
	}
}
