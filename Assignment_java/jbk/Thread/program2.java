package com.jbk.Thread;

public class program2 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Thread t1 = new Thread("JavaKiran");
		Thread t2 = new Thread("java");
		t1.start();
		t2.start();
		System.out.println("Threads name are following");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
	}

}
