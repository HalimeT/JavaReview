package com.Inheritance;

public class Division extends Calculator{
	
	public static double div(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		add(12,34);
		sub(34,6);
		System.out.println(div(38,8));
	//	mult(67,9); it does not access because it is different class's method.
		
	}

}
