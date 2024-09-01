package com.jbk.Thread;

public class Primemain {
	public static void main(String[] args) {
		ThreadPrime ob = new ThreadPrime();
		Thread t1 = new Thread (ob);
		t1.start();
	}
}
