package com.jbk.Thread;

public class Program3 extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("Thread No "+Thread.currentThread().getId()+" is running...");
		}catch(Exception e) {
			System.out.println("Exception occur....");
		}
	}
	
	public static void main(String[] args) {
		int n = 8;
		for(int i =0; i<8;i++) {
			Program3 ob = new Program3();
			ob.start();
		}
	}
	

}
