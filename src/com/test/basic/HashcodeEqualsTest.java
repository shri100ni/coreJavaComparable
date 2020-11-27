package com.test.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparetor implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {

		return o1.age - o2.age;
	}
}

class User implements Comparable<User> {
	String name;
	int age;

	User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(User o) {

		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "name=" + name + " " + "age=" + age;

	}
}

public class HashcodeEqualsTest {
	public static void main(String[] args) {
		User u1 = new User("ram", 20);
		User u2 = new User("shyam", 10);
		User u3 = new User("ashyam", 10);

		List<User> l1 = new ArrayList<User>();
		l1.add(u1);
		l1.add(u2);
		l1.add(u3);

		Collections.sort(l1);
		System.out.println(l1);

		Collections.sort(l1, new MyComparetor());
		System.out.println(l1);
	}
}
