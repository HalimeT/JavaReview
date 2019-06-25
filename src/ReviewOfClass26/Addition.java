package ReviewOfClass26;

public class Addition extends Calculator {

	Addition(){
		System.out.println("I am a constructor without any parameter");
		}
	Addition(int num1, int num2){
		
		this.num1=num1;
		this.num2=num2;
		}
	Addition(int num1,int num2, int num3){
		this(10,20);
//    	this.num1=num1;
//		this.num2=num2;
		
		this.num3=num3;
	}
	Addition(int num1,int num2, int num3,int num4){
		this(10,20,30);
		
//		this.num1=num1;
//		this.num2=num2;
// 	    this.num3=num3;
		
	    this.num4=num4;
	}
	public void add() {
		
		System.out.println(num1+num2+num3+num4);
		
	}
	public static void main(String[] args) {
		
		Calculator aa=new Addition(10,20,30);
		
		
	}
	
	

}
