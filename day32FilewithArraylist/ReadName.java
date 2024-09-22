package com.jbk.day32FilewithArraylist;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadName {
	public static void main(String[] args) {
		try {
		File f = new File("C:\\Users\\anura\\eclipse-workspace\\JBK\\src\\com\\jbk\\day32FilewithArraylist\\Target.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = (Object) ois.readObject();
		ArrayList<Eob> li = (ArrayList<Eob>)obj;
		
		for(Eob t: li) {
			System.out.println(t);
		}
		
		}
		catch (ClassNotFoundException r) {
			r.printStackTrace();
		}
		catch(IOException r) {
			r.printStackTrace();
		}
		
	}
}
