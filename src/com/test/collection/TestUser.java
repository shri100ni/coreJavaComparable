package com.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestUser {

	public static void main(String[] args) {
		User u1 = new User("ram", "raghuvanshi", 30);
		User u2 = new User("ram", "raghavan", 35);
		User u3 = new User("siya", "soni", 25);
		User u4 = new User("vinay", "verma", 30);
		List<User> list = new ArrayList<User>();

		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);

		String s1 = "rajiv";
		String s2 = "priya";
		String s3 = "pannu";
		String s4 = "atrapti";
		List<String> list1 = new ArrayList<String>();

		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		Collections.sort(list,new MyUserComparator());
		System.out.print(list);
	}
	
	

}
class MyStringComparator implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		
		return arg1.compareTo(arg0);
	}
	
}
class MyUserComparator implements Comparator<User>{

	@Override
	public int compare(User arg0, User arg1) {
		int result=arg1.getfName().compareTo(arg0.getfName());
		if(result==0){
			result=arg0.getAge()-arg1.getAge();
		}
		return result;
	}
	
}
