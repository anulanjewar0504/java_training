package com.jbk.day32FilewithArraylist;

import java.io.Serializable;

public class Eob implements Serializable{
	private int id;
	private String name;
	
	public Eob (int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Eob() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Eob [id=" + id + ", name=" + name + "]";
	}
	
	
}
