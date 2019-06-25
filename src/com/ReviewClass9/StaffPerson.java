package com.ReviewClass9;

abstract public class StaffPerson {
	String name;
	String adress;
	int salary;
	String vehicleType;
	public abstract void getVehicleType(String str);
	public abstract void getName(String str);
	public abstract void getAddress(String str);
	public abstract void getSalary(int salary);
	public void getInfo() {
	
		System.out.println(name+" "+adress+" "+salary+" "+vehicleType);
	}
		
	}
	
	class Secretary extends StaffPerson{
		
		
		@Override
		public void getVehicleType(String vehicleType) {
	     super.vehicleType=vehicleType;
	}

		@Override
		public void getName(String name) {
			super.name=name;
			
		}

		@Override
		public void getAddress(String adress) {
			super.adress=adress;
			
		}

		@Override
		public void getSalary(int salary) {
			super.salary=salary;
			
		}

		
		}
class Professor extends StaffPerson{
		
		
		@Override
		public void getVehicleType(String vehicleType) {
	     super.vehicleType=vehicleType;
	}

		@Override
		public void getName(String name) {
			super.name=name;
			
		}

		@Override
		public void getAddress(String adress) {
			super.adress=adress;
			
		}

		@Override
		public void getSalary(int salary) {
			super.salary=salary;
			
		}


		
		}


