package com.jbk.practice.logical;

public class Time {
	public void clock(int s) {
	    int h = 0;
	    int m = 0;

	    System.out.println("Hr | Min | Sec");

	    
	    for (int totalSeconds = s; totalSeconds > 0; totalSeconds -= 3600) {
	      h = totalSeconds / 3600;
	      totalSeconds %= 3600;

	      m = totalSeconds / 60;
	      totalSeconds %= 60;
	      
	      System.out.println(h+" : "+m+" : "+totalSeconds);
	    }
	  }
}
