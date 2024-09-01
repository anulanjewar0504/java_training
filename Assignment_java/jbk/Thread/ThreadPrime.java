package com.jbk.Thread;

public class ThreadPrime implements Runnable {
	@Override
	public void run() {
	for(int i =1; i<=100;i++) {
		int counter = 0;
		for(int j = 1; j<=i; j++) {
			if(i%j==0) {
				counter++;
			}	
		}
		if(counter == 2) {
			System.out.println(i+" is a prime number");
		}
	}
		
	}
}
