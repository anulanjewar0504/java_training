package com.work.encapsulation;

public class Program4 {
	private int ssn;
	private String empName;
	private int empAge;
	
//	getter method to access private data
	public int getEmpSSN() {
		return ssn;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public int getEmpAge(){
		return empAge;
	}
	
//	setter method to set new value
	public void setEmpAge(int newValue) {
		empAge = newValue;
	}
	
	public void setEmpName(String newValue) {
		empName = newValue;
	}
	
	public void setEmpSSN(int newValue) {
		ssn = newValue;
	}

}
