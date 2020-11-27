package com.test.basic;

public class ReplacString {
	
	    public static void main(String[] args) {
	       String str = "The Haunting of Hill House!";
	       System.out.println("String: "+str);
	       // replacing character at position 7
	       int pos = 7;
	       char rep = 'p';
	       String res = str.substring(0, pos) + rep + str.substring(pos + 1);
	       System.out.println("String after replacing a character: "+res);
	    }
	
}
