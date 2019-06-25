package Abstract;

public class TestCar {
	
	public static void doPrint(Vehicle obj) {
		obj.changeGear(9);
		
	}
	public static void doPrint1(Auto o) {
		o.IsAuto();
		
	}
	public static void main(String[] args) {
//		 Vehicle obj=new Car();
//		  obj.changeGear(8);
       Auto obj1=new Car();
	  
			
//			Vehicle cc= new Car();
//		
//			cc.applyBrakes(9);
//			doPrint(cc);
			doPrint1(obj1);
			
		}

}
