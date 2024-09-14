package com.jbk.day27thread;

public class JobTest {
	public static void main(String[] args) throws InterruptedException {
		Job j = new Job();
		Thread t = new Thread(j);
		Thread t1 = new Thread(j);
		Thread t2 = new Thread(j);
		
		
		
		t.setName("Thread-1");
		t1.setName("Thread-2");
		t2.setName("Thread-3");
		
		System.out.println(t.getState());
		t.join(); // waiting for complete thread operation 
		System.out.println(t.getName());
		t.start(); // to run thread
		t.join(); // To wait for Complete execution of Current thread
		
		System.out.println(t1.getState());
		t1.join(); // waiting for complete thread operation 
		System.out.println(t1.getName()); // to get name of thread
		t1.join(); // waiting for complete thread operation 
		t1.start(); // to run thread
		t1.join(); // waiting for complete thread operation 
		
		
		System.out.println(t2.getState());
		t2.join(); // waiting for complete thread operation 
		System.out.println(t2.getName()); // to get name of thread
		t2.join(); // waiting for complete thread operation 
		t2.start(); // to run thread		
		
	}
}
