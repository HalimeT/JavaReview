package ReviewOfClass26;

public class Sub extends Super {
	Sub(){
		//super(1);
		this.add();
		super.display();
		
		
	}
	Sub(int abc){
		//super(9);
		System.out.println(abc);
		
	}
	public  void add() {
		super.display();
		
		
		System.out.println("I am method of child class");
	}
	public static void main(String[] args) {
		Sub ss=new Sub(1);
		
		
	}

}
