package com.jbk.day20Strings;

public class Stringp2Builder {
	public static void main(String[] args) {
		StringBuilder c = new StringBuilder("Hello i am StringBuilder");
		
		System.out.println("String1 = " + c.toString());
		
		 
		StringBuilder str2 = new StringBuilder(10);
	    System.out.println("String2 capacity = "+ str2.capacity());
		
	    
	    
	    StringBuilder reverseStr = c.reverse();
	    System.out.println("Reverse String = "+ reverseStr.toString());
		
	   
	    
	    StringBuilder str= new StringBuilder("I can do it ");
	    System.out.println("String = "+ str.toString());
	    System.out.println("Length : "+str.length());

	    StringBuilder strReturn = str.replace(2,11, " can't");
	    
	    System.out.println("After Replace() String = "+ strReturn.toString());
	}

}
