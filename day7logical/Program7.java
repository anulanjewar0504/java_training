/*8654:
 * 4
 * 5
 * 6
 * 8
 */
package com.jbk.day7logical;

public class Program7 {
	public static void main(String[] args) {
		int num = 8645;
		int reversedNum = 0;

		// Use a for loop to reverse the number
		for (; num != 0; num /= 10) {
			System.out.println(reversedNum * 10 + num % 10);
		}
	}
}
