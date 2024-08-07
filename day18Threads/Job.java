package com.jbk.day18Threads;

public class Job extends Thread  {
	public void run() {
		for(int i =0 ;i<10;i++) {
			System.out.println(i);
		}
	}

}
