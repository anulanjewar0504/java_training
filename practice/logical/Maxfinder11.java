//passing 3 number in parameter and checking gretest number

package com.jbk.practice.logical;

public class Maxfinder11 {
  int max(int a,int b,int c) {
	  int m = 0 ;
	  if(a>b && a>c) {
		  m=a;
	  }
	  else if(b>a && b>c) {
		  m=b;
	  }
	  else {
		  m=c;
	  }
	  return m;
		
	}

}
