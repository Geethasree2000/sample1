package com.lambda;

interface ReturnChar{
	public char print(String s);
}
public class ReturnFirstCharacterFromStringLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnChar c = (String s)->{
		char ch = s.charAt(0);
		return ch;
		};
		System.out.println(c.print("hello"));


	}

}
