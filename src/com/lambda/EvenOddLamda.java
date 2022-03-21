package com.lambda;

interface EvenOdd{
	public void print(int a);
}

public class EvenOddLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd e = (int a)->{
			if(a%2 == 0){
				System.out.println("even");
			}else{
				System.out.println("odd");
			}
		};
		e.print(10);
	}
}
