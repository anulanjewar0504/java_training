package com.jbk.day18Threads.example2;

public class Job implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i<=10;i++) {
			System.out.println(
				Thread.currentThread().getName()+" "+i);
		}
		
	}

}
