package com.lambda;

interface ForLoop{
	public void print(int n);
}
public class Print1to10Lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForLoop f = (int a)->{
			for(int i = 1;i<=a;i++){
				System.out.println(i);
			}
		};
		f.print(10);
	}

}
