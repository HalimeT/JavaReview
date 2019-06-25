package Abstract;

public abstract class A {


 public void play() {
	System.out.println("can play");
}
public abstract void display();


}
  abstract class B extends A{

	public abstract void show();
	
	
	
}
class C extends B{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}