package com.ReviewClass9;

public class TestStaff {

	public static void main(String[] args) {
		StaffPerson p;
		p=new Professor();
		p.getAddress("Maryland");
		p.getName("Jack Smith");
		p.getVehicleType("Toyota");
		p.getSalary(100000);
		p.getInfo();

	}

}
