package ReviewOfClass26;

public abstract class Person {
    String name;
	String lastName;
	
     abstract  void display();
    
     
		
	}
class Employee extends Person{
	private int EmployeeId;
	Employee(){}
	Employee(String name, String lastName, int EmployeeId){
		super.name=name;
		super.lastName=lastName;
		this.EmployeeId=EmployeeId;
			}
	
	 void display() {
		 if(EmployeeId!=0) {
		 System.out.println(name+" "+lastName+" can work with employee identitity number ="+EmployeeId);
		 }else {
			 System.out.println(name+" "+lastName+" can not work" );
		 }
	}

}
