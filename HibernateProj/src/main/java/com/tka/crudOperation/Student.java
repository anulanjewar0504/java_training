//  Its a POJO class (Plane Old Java Object)
package com.tka.crudOperation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	
	private int studid;
	private String studname;
	private int age;
	private int marks;
	
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studid, String studname, int age, int marks) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studname=" + studname + ", age=" + age + ", marks=" + marks + "]";
	}
	
}
