package com.jbk.day26thread;

public class RunnableThread implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i<=10;i++) {
			System.out.println(i);
		}
	}

}
