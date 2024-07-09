package com.work.constructor;

public class Program3 {
	private int sid;
	private String name;
	private int age;
	
	Program3(){
		sid = 10;
		name = "anurag";
		age = 22;
	}
	Program3(int sid, String name, int age ){
		this.age = age;
		this.name = name;
		this.sid = sid;
	}
	//getter and setter
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
