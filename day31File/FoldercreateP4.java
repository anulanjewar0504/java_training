package com.jbk.day31File;

import java.io.File;

public class FoldercreateP4 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\anura\\eclipse-workspace\\JBK\\src\\com\\jbk\\day31File\\Generated text file\\FolderCreatedByJava");
		file.mkdir();  // its use to create folder
		System.out.println("created");
		System.out.println(file.exists()); // true
		}
	}
