package com.ReviewClass8;

public class Hello {
	Hello(){}
	Hello(int a){
		this(1,2,3);
		System.out.println("I am constructor with one parameter"+a);
	}
	Hello(int a, int b){
		System.out.println("I am constructor with two parameter"+a+" "+b);
	}
	Hello(int a, int b, int c){
		this(1,2);
	System.out.println("I am constructor with three parameter"+a+" "+b+" "+c);
	}
	public static void main(String[] args) {
		Hello hh=new Hello(7);
		
	}
}
