package com.test.dailyTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.lang.model.element.Element;

public class TestUser {

	public static void main(String[] args) {

		User u1 = new User("rahul", "pare", 29);

		User u2 = new User("karan", "ravat", 39);

		User u3 = new User("vaibhav", "jen", 25);

		User u4 = new User("madhavi", "mudgal", 49);

		Set<String> set = new TreeSet<String>();
		set.add("monika");
		set.add("priya");
		set.add("rahul");
		set.add("pranaya");
		
		System.out.println(set);
		
		List<String> list = new ArrayList<String>();
		list.add("monika");
		list.add("priya");
		list.add("rahul");
		list.add("pranaya");
		
		System.out.println(list);

		// List<User> list = new ArrayList<User>();
		// list.add(u1);
		// list.add(u2);
		// list.add(u3);
		// list.add(u4);

		// Set<User> set = new TreeSet<User>();
		// set.add(u1);
		// set.add(u2);
		// set.add(u3);
		// set.add(u4);
		// System.out.println("set for defoult sorting" + set);
		// System.out.println("list" + list);
		//
		// Collections.sort(list);
		//
		// Iterator it = set.iterator();
		// while (it.hasNext()) {
		// User element = (User) it.next();
		// System.out.println(element);
		// }
		// System.out.println(list);
		// Collections.sort(list, new SortByFirstNameComparator());
		// System.out.println(list);
		// Collections.sort(list, new SortByLastNameComparater());
		// System.out.println(list);

	}

}
