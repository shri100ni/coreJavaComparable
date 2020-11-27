package com.test.basic;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class UserSetTest {

	public static void main(String[] args) {
		UserExcForSet u1=new UserExcForSet("ram", "soni");
		UserExcForSet u2=new UserExcForSet("vivek", "chohan");
		UserExcForSet u3=new UserExcForSet("pralay", "mishra");
		UserExcForSet u4=new UserExcForSet("bharas", "nagar");

		Set<UserExcForSet> set = new TreeSet<UserExcForSet>();
		set.add(u1);
		set.add(u2);
		set.add(u3);
		set.add(u4);
		
		System.out.println(set);
	}

}
