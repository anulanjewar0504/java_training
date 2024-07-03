package com.jbk.day11constructor;

public class Doctor1 {
	int  id;
	String name;
	float exp;
	String spec;
	public Doctor1() {
		
	}
	Doctor1(int  id,String name,float exp,String spec){
		this.id =id;
		this.name = name;
		this.exp = exp;
		this.spec = spec;
		
	}
	Doctor1(int  id,String name,String spec){
		this.id =id;
		this.name = name;
		this.spec = spec;
		
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", exp=" + exp + ", spec=" + spec + "]";
	}
	
}
