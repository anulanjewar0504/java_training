package com.jbk.day28Lambdafunction;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		Runnable e = () -> {
			for(int i = 0; i<10;i++) {
				System.out.println(i);
			}
		};
		Thread t = new Thread (e);
		t.start();
		t.join();
		System.out.println();
		
//		 here we are creating object of thread and applying lambda function in object
		
		new Thread (() -> {
			for(int i = 0; i<10;i++) {
				System.out.println(i);
			}
		}).start();
	}
}
