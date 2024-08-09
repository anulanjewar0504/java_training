package com.jbk.day21java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Datetest {
	public static void main(String[] args) {
		
		LocalDate localdate = LocalDate.now();
		System.out.println(localdate);
		
		LocalTime localtime = LocalTime.now();
		System.out.println(localtime);
		
		LocalDateTime ldc = LocalDateTime.now();
		System.out.println(ldc);
	}

}
