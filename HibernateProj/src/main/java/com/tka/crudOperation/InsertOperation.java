package com.tka.crudOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertOperation {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory factory = cfg.buildSessionFactory(); // building session
		Session session = factory.openSession(); // opening session which is stored in factory 
		Student student = new Student(8,"Eesha",22,80);
		
		session.save(student);
		Transaction tx = session.beginTransaction();
		tx.commit();
		System.out.println("Record inserted successfully");
	}

}
