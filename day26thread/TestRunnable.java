package com.jbk.day26thread;

public class TestRunnable {
	public static void main(String[] args) {
		RunnableThread t1 = new RunnableThread();
		Thread t = new Thread(t1);
		t.start();
	}

}
