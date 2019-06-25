package com.Inheritance;

public class Multiplication extends Calculator {
	
	public static void mult(int a, int b) {
		System.out.println(a*b);
	}

	public static void main(String[] args) {
	    mult(10,90);
	    Multiplication.add(67, 90);
	    Multiplication.sub(78,45);
        add(45,67);
        sub(798,678);// inheritance class, so you can directly call the static method without class name..
	}

}
