package com.jbk.day27thread;

public class Job implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i<=10; i++) {
			System.out.println(i);
		}
		
	}
	
}
