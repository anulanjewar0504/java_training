// ENTITY CLASS
package com.jbk.day33database;

public class Students {
	
	private int sid;
	private String sname;
	private String scourse;
	
	public Students() {
		
	}
	
	
	public Students( int sid, String sname, String scourse) {
		
		this.sid = sid;
		this.sname = sname;
		this.scourse = scourse;
	}
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	@Override
	public String toString() {
		return "Students [Student id: " + sid + ", Student name: " + sname + ", course: " + scourse + "]";
	}
	
}
