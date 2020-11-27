package com.test.dailyTask;

import java.util.HashMap;
import java.util.Map;

public class TestUserKey {

	public static void main(String[] args) {

		UserKey u1=new UserKey("gorav", "ravat", 29);
		UserKey u2=new UserKey("vaibhav", "soni", 39);
		UserKey u3=new UserKey("garvita", "vaishnav", 30);
		UserKey u4=new UserKey("pragya", "verma", 27);
		
		Map<UserKey, Integer> map=new HashMap<UserKey, Integer>();
		map.put(u1, 50000);
		map.put(u2, 20000);
		map.put(u3, 40000);
		map.put(u4, 60000);
		
		
		System.out.println(map.get(u2));
		System.out.println(map.get(u1));
		System.out.println(map.get(u4));
		System.out.println(map.get(u3));

	}

}
