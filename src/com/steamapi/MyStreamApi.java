package com.steamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = new ArrayList<Integer>();

		ls.add(10);
		ls.add(20);
		ls.add(3);
		ls.add(1);
		ls.add(5);

		// return the object of stream
		Stream<Integer> st = ls.stream();
		// lambda for printing
		st.forEach(a -> System.out.println(a));
		System.out.println("--------");
		// stream is operated
		ls.stream().forEach(a -> System.out.println(a));
		System.out.println("--------");
		ls.stream().forEach(System.out::print);
		System.out.println();
		List<Integer> ls2 = ls.stream()
				.filter((a) -> (a > 5))// greater than
				// less than
				// ==
				// !=
				//filter will return true or false
				.sorted(Collections.reverseOrder()) // sort the method
				// .forEach(System.out::println);
				.map(a -> a*a) // input and output data will be same. It will manipulate the data and add to data it can change the datatype
				.collect(Collectors.toList()); // take the one by one value and
												// collected
		ls2.forEach(System.out::println);

	}
	/*
	 * public int filter(int a){ if(a > 5){ return a; } }
	 */
}
