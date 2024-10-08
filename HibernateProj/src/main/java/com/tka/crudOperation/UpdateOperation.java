package com.tka.crudOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateOperation {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory factory = cfg.buildSessionFactory(); // building session
		Session session = factory.openSession(); // opening session which is stored in factory 
		Student student = new Student(7,"Tushar",25,70);
		
		session.update(student);
		Transaction tx = session.beginTransaction();
		tx.commit();
		System.out.println("Record updated successfully");
	}

}
