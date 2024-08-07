package com.jbk.day19Threads;

public class MultiThreadInOneOb {
	public static void main(String[] args) throws InterruptedException {
		Y y = new Y();
		Thread t1 = new Thread(y);
		Thread t2 = new Thread(y);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(y.a);
	}
}
