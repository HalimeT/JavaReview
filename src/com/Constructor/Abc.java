package com.Constructor;

public class Abc {
	//2. Test your code with the Main.java class:
	//Create several Car objects using all Constructors and print their fields/states to make sure it's correct.
	//print your objects with variables in your output each object

	String make;
	String model;
	int numberOfDoors;
	int topSpeed;
	double price;
	
	
	Abc(){
		
	}
	
	Abc(String make,String model,int numberOfDoors,int topSpeed,double price){
		this.make=make;
		this.model=model;
		this.numberOfDoors=numberOfDoors;
		this.topSpeed=topSpeed;
		this.price=price;
		
		}
	
	Abc(String make,String model,int topSpeed,double price){
		this.make=make;
		this.model=model;
		this.topSpeed=topSpeed;
		this.price=price;
		this.numberOfDoors=4;
	}
	
	Abc(int numberOfDoors,int topSpeed,double price){
		this.make="unknown";
		this.model="unknown";
		this.numberOfDoors=numberOfDoors;
		this.topSpeed=topSpeed;
		this.price=price;
		
	}
	
	public void getInfo() {
		System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
	
	
	
	
}
