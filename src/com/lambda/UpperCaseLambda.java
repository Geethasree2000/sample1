package com.lambda;

interface Upper{
	public void print(String s);
}
public class UpperCaseLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Upper u = (String s)->System.out.println(s.toUpperCase());
		u.print("hello world");

	}

}
