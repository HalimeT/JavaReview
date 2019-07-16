package com.Constructor;

public class Circle {
	private double radius;
	private String color;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius>0) {
		this.radius = radius;
		}else {
			System.out.println("Radius can not be less than zero");
		}
	}

	public String getColor() {
		
		
		return color;
	}

	public void setColor(String color) {
		if(color.equalsIgnoreCase("red")||color.equalsIgnoreCase("blue")||color.equalsIgnoreCase("green")) {
		this.color = color;
		}else {
			System.out.println("this is not valid color");
		}
	}

	
	public Circle() {
		radius=1.0;
		color="red";
		
	}
	
	public Circle(double radius) {
		this.radius=radius;
		
	}
	
	public Circle(double radius, String color) {
		this.radius=radius;
		this.color=color;
		
		
	}
	public String toString() {
		return "radius: "+radius+" and the color: "+color;
	}
	public double getArea() {
		double area=3.14*(radius)*(radius);
		return area;
	}
   









	
}
