package com.ReviewClass7;

public  class Animal {
	String species;
	
	 final int age=8;
    boolean hasSketelon;
   boolean tail=false;
    
    Animal(){}  // non-return type method.--->constructor
    Animal(String a, boolean t, boolean h ){ 
    	species=a;
    	
    	
    	hasSketelon=h;
    	System.out.println(species+" "+age+" "+tail+" "+hasSketelon);
    
    	
    }
    
   void canEat() {
    	System.out.println("Animal can eat");
    	
    }
    boolean canMove() {
    	return true;
    }
    void Print() {
    	System.out.println(species+" "+age+" "+tail+" "+hasSketelon);
    }
    

}
class Vertebrates extends Animal{
	Vertebrates(){}
	Vertebrates(String a, boolean t){ 
    	species=a;
    
    	
    	
	}
	
	int numberOfLeg;
	
	void canEat() {
		System.out.println("Vertebrates can eat");
	}
	void  canFertile() {
		System.out.println("Vertebrates can fertile");
	}
	}
class Mammals extends Vertebrates{
	
	@Override
	boolean canMove() {
		
		return false;
		
	}
	
	 void canEat() {
		System.out.println("Mammals do not eat meat");
	}
	
	
}
