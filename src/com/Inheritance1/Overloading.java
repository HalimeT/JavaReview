package com.Inheritance1;

public class Overloading {
	
	private static void add(int a,int b) {
	 
	System.out.println(a+b);
	}
	private static void add(int a,int b, int c) {
		 
		System.out.println(a+b+c);
		}
	private static void add(int a,int b, double c) {
		 
		System.out.println(a+b+c);
		}

	public static void main(String[] args) {
		add(13,35);
		add(10,9,9.5);
		add(12,6,90);
		
		
		

	}

}
