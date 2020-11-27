package com.test.dailyTask;

import java.util.Comparator;

class SortByLastNameComparater implements Comparator<User>{

			@Override
			public int compare(User o1, User o2) {
				
				return o2.getlName().compareTo(o1.getlName());
			}
			 
		 }
