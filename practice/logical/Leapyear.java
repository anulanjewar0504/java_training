package com.jbk.practice.logical;

public class Leapyear {
	void findLeapYear (int year) {
		if (year % 4 == 0) {
		      if (year % 100 == 0) {
		        if (year % 400 == 0) {
		          System.out.println(year + " is a leap year.");
		        } else {
		          System.out.println(year + " is not a leap year.");
		        }
		      } else {
		        System.out.println(year + " is a leap year.");
		      }
		    } else {
		      System.out.println(year + " is not a leap year.");
		    }
	}

}
