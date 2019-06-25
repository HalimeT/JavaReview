package ReviewOfClass26;

public class Car {
	public void drive() {
		System.out.println("Car drives");
		
	}
 public void drive(int speed) {
	 System.out.println("Car drives with speed : "+speed);
 } 
}
 class BMW extends Car{
	public void drive() {
		System.out.println("BMW drives fast");
	}
	public void adjustableCam() {
		System.out.println("BMW has adjustable camera");
		
	}
}
 class Honda extends Car{
	 public void drive() {
		 System.out.println("Honda drives safe");
	 }
 }
