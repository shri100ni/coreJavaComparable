package com.test.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestForFailSafe {

	public static void main(String[] args) {
		User user1 = new User("ram", "verma", 28);
		User user2 = new User("chandni", "rathod", 38);
		User user3 = new User("maur", "veshnav", 23);
		User user4 = new User("megha", "meena", 29);
		List<User> list = new ArrayList<User>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);

		CopyOnWriteArrayList<User> list1 = new CopyOnWriteArrayList<>();

		list1.add(user1);
		list1.add(user2);
		list1.add(user3);
		list1.add(user4);

		Iterator<User> it = list.iterator();
		list1.remove(0);
		while (it.hasNext()) {
			System.out.println(it.next());
			// list.remove(2);

		}

		/*
		 * for(User u : list) { list.add(user4);
		 * System.out.println(u.getfName()); }
		 */

		/*
		 * int c = list.size(); for (int i = 0; i < c; i++) { User u =
		 * list.get(i); System.out.println(u.getfName()); list.get(i); }
		 */
	}
}
