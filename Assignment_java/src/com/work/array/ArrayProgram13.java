// Sort integer array
package com.work.array;

import java.util.Arrays;

public class ArrayProgram13 {
	public static void bubbleSort(int []arr) {
		int j = 0;
		int tem;
		boolean sorted = false;
		while(!sorted) {
			sorted = true;
			j++;
			for(int i=0;i<arr.length-j;i++) {
				if(arr[i]>arr[i+1]) {
					tem = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=tem;
					sorted = false;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[]array = {5,1,100,50,75,12,51,11,28,99};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
}
