package com.lambda;

interface CubeRoot{
	public int print(int a);
}
public class CubeRootLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CubeRoot c = (int a)->{
			int num = (int)Math.cbrt(a);
			return num;
		};
		System.out.println(c.print(125));
	}

}
