package com.ReviewClass8;

public class MainSuper {
	MainSuper(){
		System.out.println("This is constructor without parameter from parent");
	}
	MainSuper(int a){
		System.out.println("This is parent with one parameter" );
	}
	MainSuper(int a, int b){
		System.out.println("This is parent with two parameter" );
		
	}
	

}
class ChildSuper extends MainSuper{
	ChildSuper(){
		System.out.println("This is constructor without parameter from child");
	}
	ChildSuper(int b){
		super(1);
		System.out.println("This is from child with one parameter" );
		
	}
	ChildSuper(int c, int a){
		System.out.println("This is from child with two parameter" );
		
	}
	
	
}
