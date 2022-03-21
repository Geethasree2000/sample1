package com.lambda;

interface Positive{
	public void print(int a);
}
public class PositiveNumLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Positive p = (int a)->{
			if(a >= 0){
				System.out.println("positive number");
			}else{
				System.out.println("negative number");
			}
		};
		p.print(-43);
	}

}
