package com.lambda;

interface Code {
	public void execute(int a, int b);
}

interface World1 {
	public void print();
}

interface EvenOdd1 {
	public void print(int a);
}

interface Positive1 {
	public void print(int a);
}

interface ReturnChar1 {
	public char print(String s);
}

interface ForLoop1 {
	public void print(int n);
}

interface Cube1 {
	public int print(int a);
}

interface Upper1 {
	public void print(String s);
}

public class MyLambda {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// use to store the value in variable
		// int a = 0;
		// int b = 0;

		// able to store code or method in variable
		// with help of lambda it is possible
		// we do not need the access modifier
		// we also do not need the return type
		// remove the method name because you can call in variable name
		// add lamda symbol(->)
		// method cannot store in normal or primitive datatype
		// create a interface
		// create object of interface which will hold the value of interface
		// remove the input type also
		// sum of two number
		Code c = (int a, int b) -> System.out.println(a + b);
		c.execute(10, 20);

		// hello world
		World1 w = () -> System.out.println("hello world");
		w.print();

		// even or odd
		EvenOdd1 e = (int a) -> {
			if (a % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		};
		e.print(10);

		// positive or negative
		Positive1 p = (int a) -> {
			if (a >= 0) {
				System.out.println("positive number");
			} else {
				System.out.println("negative number");
			}
		};
		p.print(-43);

		// return 1st character
		ReturnChar1 c1 = (String s) -> {
			char ch = s.charAt(0);
			return ch;
		};
		System.out.println(c1.print("hello"));

		// print 1 to 10
		ForLoop1 f = (int a) -> {
			for (int i = 1; i <= a; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		};
		f.print(10);

		// cube of number
		Cube1 c2 = (int a) -> {
			int num = (int) Math.pow(a, 3);
			return num;
		};
		System.out.println(c2.print(2));

		// upper case of string
		Upper1 u = (String s) -> System.out.println(s.toUpperCase());
		u.print("hello world");
	}

}
