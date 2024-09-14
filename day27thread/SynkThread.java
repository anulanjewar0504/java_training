package com.jbk.day27thread;

public class SynkThread implements Runnable  {
	static int a;
	@Override
	public void run() {
		for(int i = 0; i<1000; i++) {
			increment();
		}
	}
	synchronized public void increment() {
		a = a+1;
	}

}
