package com.jbk.day27thread;

public class PrimeThread implements Runnable {
	public void checkPrime() {
		int i, m = 0, flag = 0, count=0;

		for (int n = 2; n <= 100; n++) {
			m = n / 2;
			flag = 0;

			if(n == 0 || n ==1) {
				System.out.println(n);
			}else {
				for (i = 2; i <= m; i++) {
					if (n % i == 0) {
						flag = 1;
						System.out.println(n);
						break;
					}
				}

				if (flag == 0) {
					count++;
					System.out.println(n + " prime number");
				}
			}
		}
		System.out.println("Total prime number in the range of 1 to 100 is: "+count);
	}

	@Override
	public void run() {
		checkPrime();
	}

}