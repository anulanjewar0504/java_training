package com.jbk.day18Threads.example2;

public class Jm {
	public static void main(String[] args) {
		Job job = new Job();
		Thread t1 = new Thread(job);
		Thread t2 = new Thread(job);
		Thread t3 = new Thread(job);
		
		t1.setName("First");
		t2.setName("Second");
		t3.setName("Third");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
