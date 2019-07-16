package com.Constructor;

public class CircleDemo {

	public static void main(String[] args) {
    	Circle obj=new Circle();
//		System.out.println(obj.toString());
//		System.out.println(obj.getArea());
//		
//		obj=new Circle(5.2);
//		System.out.println(obj.toString());
//		System.out.println(obj.getArea());
//		
		obj=new Circle(6,"white");
		obj.setColor("white");
		System.out.println(obj.toString());
		System.out.println(obj.getArea());
		
		obj=new Circle(-3);
		obj.setRadius(-3);
		System.out.println(obj.toString());
		System.out.println(obj.getArea());
		
//		obj=new Circle(3,"red");
//		System.out.println(obj.toString());
//		System.out.println(obj.getArea());
		
	}

}
