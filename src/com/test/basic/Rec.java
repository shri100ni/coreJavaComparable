package com.test.basic;

class Parent {
	String name;
	int age;
	String address;
	public void m1() {
		System.out.println("Parent m1");
	}

	public void m2() {
		System.out.println("parent m2");
	}
}

class Child extends Parent {
	public void m1() {
		System.out.println("Chiled m1");
	}
	
	public void m3() {
		
	}
}

class Child2 extends Parent {
	public void m1() {
		System.out.println("Child2 m1");
	}
}

public class Rec implements Animals, Human {

	public static void main(String[] args) {

		Parent p1 = new Child();
//		Child cc = (Child)p1;
//		cc.m3();
		System.out.println(p1.hashCode());
		Child cc = (Child)p1;
		cc.m3();
		
		Parent p= new Child2();
		Parent p2 = new Parent();
		
		Child c = new Child();
		//Child c2 = (Child) p2;
		System.out.println((Child) p2); // down casting is supported here is the example

		p1.m1();// Chiled m1
		p1.m2();// parent m2
		p2.m1();// parent m1
		p2.m2();// parent m2

		c.m1();// Chiled m1
		c.m2();// parent m2
		// c2.m1();// parent m1
		// c2.m2();// parent m2

		//c3.m1();//
		//c3.m2();//
	}

	@Override
	public void run() {
		Animals.super.run();
	}
}
