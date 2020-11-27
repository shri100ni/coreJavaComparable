package oop;

public class Student {
	private String name;
	private int roll_no;
	
	

	public Student(String name, int roll_no) {
		super();
		this.name = name;
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + "]";
	}

}
