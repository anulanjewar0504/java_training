package com.jbk.day16Collection;

public class Employee {
	int id ;
	String name;
	String jdate;
	String role;
	double salary;
	
	public Employee(int id, String name, String jdate, String role, double salary) {
	this.id = id;
	this.name = name;
	this.jdate = jdate;
	this.role = role;
	this.salary = salary;
	
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

	public String getJdate() {
		return jdate;
	}

	public void setJdate(String jdate) {
		this.jdate = jdate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", jdate=" + jdate + ", role=" + role + ", Salary=" + salary
				+ "]";
	}
}
