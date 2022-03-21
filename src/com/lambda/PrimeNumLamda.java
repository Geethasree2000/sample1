package com.lambda;

interface Prime{
	public void print(int a);
}
public class PrimeNumLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime p = (int num)->{
			boolean flag = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		};
		p.print(3);
	}

}
