package com.test.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {

	public static void main(String[] args) {
		String s = "1";
		String s2 = new String("1");
		System.out.println(s == s2);

		List<String> list = Arrays.asList("1", "2", "3", "1", "2", "4");
		List<String> distinctElements = list.stream().distinct().collect(Collectors.toList());

		// Let's verify distinct elements
		System.out.println(distinctElements);

		/*
		 * // list.forEach(System.out::println); List<Integer> newList =
		 * list.stream().map(x ->
		 * Integer.parseInt(x)).collect(Collectors.toList()); newList =
		 * newList.stream().filter(x -> (x > 2)).collect(Collectors.toList());
		 * newList.forEach(System.out::println);
		 */
	}

}
