package com.lambda;

interface Subtraction {
	public void print(double a, double b);
}

public class SubtractionLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subtraction s = (double a, double b) -> System.out.println(a - b);
		s.print(12.32, 54.54);

	}

}
