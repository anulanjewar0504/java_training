
package com.jbk.day24collection;

import java.util.ArrayList;

public class ArrayListTesting {
	public static void main(String[] args) {
		ArrayList<Student> alStu = new ArrayList<>();
		Student stu = new Student(12, "Pune", new Phone(232,4000));
		Student stu1 = new Student(12, "Pune1", new Phone(200,2000));
		Student stu2 = new Student(12, "Pune2", new Phone(280,1000));
		Student stu3 = new Student(12, "Pune3", new Phone(762,6000));
		Student stu4 = new Student(12, "Pune4", new Phone(659,8000));
		
		
		alStu.add(stu);
		alStu.add(stu1);
		alStu.add(stu2);
		alStu.add(stu3);
		alStu.add(stu4);
		
		for(Student student:alStu) {
			Phone pp = student.phone;
			System.out.println(student.loc);
			System.out.println(student.age);
			System.out.println(pp.mobNumber);
			System.out.println(pp.cost);
			System.out.println("---------------------------------\n\n");
			
		}
	}
}
