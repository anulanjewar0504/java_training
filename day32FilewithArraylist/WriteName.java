package com.jbk.day32FilewithArraylist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class WriteName implements Serializable {
	public static void main(String[] args) {
		Eob e1 = new Eob(1,"Anurag");
		Eob e2 = new Eob(2,"Shravani");
		Eob e3 = new Eob(3,"Pratik");
		Eob e4 = new Eob(4,"Hrutuja");
		Eob e5 = new Eob(5,"Om");
		Eob e6 = new Eob(6,"Shrushti");
		
		ArrayList<Eob>list = new ArrayList<Eob>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
		
		try {
		File f = new File("C:\\Users\\anura\\eclipse-workspace\\JBK\\src\\com\\jbk\\day32FilewithArraylist\\Target.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		System.out.println("Objects are written in the file.....");
		}
		catch (FileNotFoundException r){
			r.printStackTrace();
		}catch (IOException r) {
			r.printStackTrace();
		}
		
		System.out.println("data is copied.....");
	}
}
