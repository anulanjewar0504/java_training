package com.jbk.day27thread;

public class TestSynk {
	public static void main(String[] args) throws InterruptedException {
		SynkThread t = new SynkThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(SynkThread.a);
		
	}
}
