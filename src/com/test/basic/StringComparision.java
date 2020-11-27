package com.test.basic;

public class StringComparision {

	public static void main(String[] args) {
		String l1 = "java";
		String l2 = "java";

		String s1 = new String("java");
		String s2 = new String("java");
		
		System.out.println("litreal case");
		System.out.println(l1 == l2);
		System.out.println(l1.equals(l2));
		
		/*System.out.println("new keyword case");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("new keyword with litreal case");
		System.out.println(l1 == l2);
		System.out.println(l1.equals(s1));*/
	}

}
