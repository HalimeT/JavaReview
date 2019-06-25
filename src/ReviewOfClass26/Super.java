package ReviewOfClass26;

public class Super {
	Super(){
		System.out.println("I am constructor of parent class without arg");
	}
	Super(int a){
		System.out.println("I am constructor of parent class with one arg="+a);
	}
	Super(String a){
		System.out.println("I am string constructor parent= "+a);
		
	}
	public static void display() {
		System.out.println("I am method of parent class ");
	}

}
