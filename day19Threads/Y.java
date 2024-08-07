package com.jbk.day19Threads;

public class Y implements Runnable{
	int a = 0;
	@Override
	 public void run() {
		for(int i = 1; i<=100;i++)
			increment();
		
	}
	synchronized void increment() {
		a = a+1;
	}

}
