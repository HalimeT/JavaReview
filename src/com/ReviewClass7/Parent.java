package com.ReviewClass7;

public class Parent {
	String name;
	int age;
	String lastName;
	
	Parent(){
		System.out.println("This is a constructor");
	}
	Parent(String a, String b, int c){
		name=a;
		lastName=b;
		age=c;
		
	}
	public static void main(String[] args) {
		Parent pp=new Parent("John","Smith",34);
		System.out.println(pp.name+" "+pp.lastName+" "+pp.age);
		
	}

}
