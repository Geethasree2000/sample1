package com.steamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = new ArrayList<Integer>();

		ls.add(10);
		ls.add(20);
		ls.add(3);
		ls.add(1);
		ls.add(5);
		Stream<Integer> st = ls.stream();
		ls.stream().forEach(a -> System.out.println(a));
		System.out.println("--------");
		List<Integer> ls2 = ls.stream().filter((a) -> (a %2 == 0))
				.sorted(Collections.reverseOrder())
				.map(a -> a)
				.collect(Collectors.toList()); 
		ls2.forEach(System.out::println);
	}

}
