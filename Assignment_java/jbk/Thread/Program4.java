package com.jbk.Thread;

public class Program4 implements Runnable{

	@Override
	public void run() {
	System.out.println("Thread is running....");
		
	}
	public static void main(String[] args) {
		Program4 ob = new Program4();
		Thread t1 = new Thread(ob);
		t1.start();
	}
	
	
}
