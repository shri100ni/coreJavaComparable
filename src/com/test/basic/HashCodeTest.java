package com.test.basic;

class Employee {
	private String id;
	private String name;
	private double salary;

	public Employee(String id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;

		System.out.println("this name: " + this.name);
		System.out.println("parameter name: " + e.name);

		if (e.id.equalsIgnoreCase(this.id)) {
			return true;
		}
		return false;
	}
}

public class HashCodeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("1a", "krishna verma", 10000.0);
		Employee e2 = new Employee("2", "Rajat", 20000.0);
		Employee e3 = new Employee(new String("1A"), "krishn", 10000.0);

		if (e3.equals(e1)) {
			System.out.println("Employees are equal");
		} else {
			System.out.println("Employees are not equal");
		}
	}

}
