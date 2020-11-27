package com.test.basic;

public interface Human {
default void run(){
	System.out.println("human run method");
}
}
