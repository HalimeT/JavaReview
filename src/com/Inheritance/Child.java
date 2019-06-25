package com.Inheritance;

public class Child extends Parent {
	Child(){
		System.out.println("I am from child Class");
	}
	
	
	public static void main(String[] args) {
		
		Child cc=new Child();
		System.out.println(cc.reverse("one"));
		System.out.println(cc.reverse("one", "two"));
		
//        System.out.println(Child.display(true,true));
//		System.out.println(Child.display(false,true));
//		System.out.println(display(true,false));
//		System.out.println(cc.display(false,false));
	}

}
