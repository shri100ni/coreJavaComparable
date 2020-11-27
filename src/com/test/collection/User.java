package com.test.collection;

public class User implements Comparable<User> {
	private String fName;
	private String lName;
	public String getfName() {
		return fName;
	}
	 
	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;

	public User(String fName, String lName, int age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
	}

	@Override
	public int compareTo(User o) {
		
		return this.age-o.age;
	}

}
