package com.ReviewClass7;

public class Final {
	final int capacity;
	
	final static int age;
	
	final String name;
	
	{
		capacity=20;
	}
	
	static{
		age=39;
	}
	
	Final(){
		name="Betul";
	}
	
	void display(){
	System.out.println(capacity);	
	
	}

	public static void main(String[] args) {
		final int age;
		age=9;
		Final ff=new Final();
		ff.display();

	}

}
