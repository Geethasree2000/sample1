package com.lambda;

interface World {
	public void print();
}

public class HelloWorldLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		World w = () -> System.out.println("hello world");
		w.print();
	}

}
