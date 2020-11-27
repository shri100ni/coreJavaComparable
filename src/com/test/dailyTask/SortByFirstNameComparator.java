package com.test.dailyTask;

import java.util.Comparator;

public class SortByFirstNameComparator implements Comparator<User>{

		public int compare(User o1, User o2) {
			
			return o2.getfName().compareTo(o1.getfName()) ;
		}
		 
	 }