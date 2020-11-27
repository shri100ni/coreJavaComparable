package com.test.basic;

public class UserExcForSet implements Comparable<UserExcForSet>{
	private String FName;
	private String LName;
	

	public UserExcForSet(String fName, String lName) {
		super();
		FName = fName;
		LName = lName;
	}

	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}

	@Override
	public String toString() {
		return "UserExcForSet [FName=" + FName + ", LName=" + LName + "]";
	}

	@Override
	public int compareTo(UserExcForSet o) {
		// TODO Auto-generated method stub
		return this.FName.compareTo(o.FName);
	}
	
}
