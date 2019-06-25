package Abstract;


 interface Vehicle {
	 final int wheel=4;
	    void changeGear(int a); 
	    void speedUp(int a); 
	    void applyBrakes(int a); 
	 
    
}
 interface Auto{
	 void IsAuto();
 }
 public class Car implements Vehicle,Auto{// concrete class can implements multiple interfaces...
	 

	@Override
	public void changeGear(int a) {
		System.out.println("change gear to speed up");
		
	}

	@Override
	public void speedUp(int a) {
		
		
	}

	@Override
	public void applyBrakes(int a) {
	System.out.println("apply break to stop car");	
	}
	

	@Override
	public void IsAuto() {
		System.out.println("car is a automobile");
		
		
	}
 }
 
