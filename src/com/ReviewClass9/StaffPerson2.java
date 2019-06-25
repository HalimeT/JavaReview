package com.ReviewClass9;

public class StaffPerson2 {
	 String name;
	    int salary;
	    String hireDate;
	    String department;

	    StaffPerson2(String name, int salary, String hireDate,String department) {
	        this.name = name;
	        this.salary = salary;
	        this.hireDate = hireDate;
	        this.department=department;
	    }

	 }

	class SecretaryA extends StaffPerson2 {

	    SecretaryA(String name, int salary, String hireDate,String department) {
	        
	    	super(name, salary, hireDate,department);
	       
	  System.out.println(name+" is a secretary works at the "+ department+ " department, and was hired at "+hireDate);
	    }

	 }

	class Professor1 extends StaffPerson2 {

	    Professor1(String name, int salary, String hireDate,String department) {
	        super(name, salary, hireDate,department);
	  System.out.println(name+" is a professor works at the "+ department+ " department,and was hired at "+hireDate);
	    }
    }

	class Test {
	    
	    
	    public static void main(String[] args) {
	        Professor1 obj1 = new Professor1("John1", 100000, "28.09.2018","IT");
	        Professor1 obj2 = new Professor1("John2", 110000, "28.10.2018","IT");
	        Professor1 obj3 = new Professor1("John3", 120000, "28.11.2018","IT");
	        
	        SecretaryA obj01=new SecretaryA("Moss",55000,"12.12.2018","F@B");
	        SecretaryA obj02=new SecretaryA("Moss1",55000,"13.12.2018","F@B");
	        
	        
	        System.out.println("Combine salary is: "+(obj1.salary+obj2.salary+obj3.salary+obj01.salary+obj02.salary));
	        
	        
	    }


	}


