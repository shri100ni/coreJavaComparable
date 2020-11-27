package com.test.basic;

public interface StaticAndDefoultTest {
	void m1();

	public static void m2() {
		System.out.println("hello i am static");
	}

	public default void m3() {
		System.out.println("hello i am default");
	}

	void m4();

}
