package com.work.encapsulation;

public class Test4 {
	public static void main(String[] args) {
		Program4 obj = new Program4();
		obj.setEmpName("Anurag");
		obj.setEmpAge(20);
		obj.setEmpSSN(1112223);
		System.out.println("Employee Name: "+obj.getEmpName()+"\nEmployee SSN: "+obj.getEmpSSN()+"\nEmployee Age: "+obj.getEmpAge());
	}
}
