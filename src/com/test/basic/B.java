package com.test.basic;

import java.util.Date;

public final class B {
	private final String name;
	private final Date d;

	public B(String name, Date d) {
		super();
		this.name = name;
		this.d = d;
	}

	public String getName() {
		return name;
	}

	public Date getD() {
		return (Date) d.clone();
	}

	@Override
	public String toString() {
		return "B [name=" + name + ", d=" + d + "]";
	}

}
