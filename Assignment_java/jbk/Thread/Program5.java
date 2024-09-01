package com.jbk.Thread;

public class Program5 implements Runnable {
	@Override
	public void run() {
	try {
		System.out.println(Thread.currentThread().getId()+" Is running");
	}
	catch(Exception e) {
		System.out.println("Exception occur....");
	}
	}
	
	public static void main(String[] args) {
		int n = 8;
		for(int i =0; i<8;i++) {
			Program5 ob = new Program5();
			Thread t1 = new Thread(ob);
			
			t1.start();
		}
	}
	

}
