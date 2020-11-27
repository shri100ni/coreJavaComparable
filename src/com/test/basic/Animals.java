package com.test.basic;

public interface Animals {
	default void run(){
		System.out.println("Animals run method");
	}
}
