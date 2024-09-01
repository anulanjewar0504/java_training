package com.work.array;

public class ArrayProgram6 {
	public static void main(String[] args) {
		int[] values1 = { 12, 36, 48, 98, 65, 75 };
		int[] values2 = { 20, 30, 10, 50, 40, 80, 30, 70, 30, 90 };

		int[] merge = new int[values1.length + values2.length];
		
		for (int i = 0; i < values1.length; i++) {
			merge[i] = values1[i];
		}

		for (int i = 0; i < values2.length; i++) {
			merge[i+values1.length] = values2[i];
		}
		for (int i = 0; i < merge.length; i++) {
			System.out.print(merge[i]+" ");
		}

	}
}
