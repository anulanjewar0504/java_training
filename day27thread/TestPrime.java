package com.jbk.day27thread;

public class TestPrime {
	public static void main(String[] args) {
		 PrimeThread pt = new  PrimeThread();
		Thread t = new Thread(pt);
		t.start();
	}
}
