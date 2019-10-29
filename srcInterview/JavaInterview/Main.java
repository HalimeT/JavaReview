package JavaInterview;

abstract class Bas {
	   Bas() { 
		   System.out.println("Base Constructor Called");
		   }
	   abstract void fun();
	}
	class Deriv extends Bas {
	   Deriv() {
		   super();
		   System.out.println("Derived Constructor Called"); }
	   void fun() { System.out.println("Derived fun() called"); }
	}
public	class Main {
	   public static void main(String args[]) {
	      Deriv d = new Deriv();
	   }
	}
