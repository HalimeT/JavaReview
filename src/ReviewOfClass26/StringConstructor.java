package ReviewOfClass26;

public class StringConstructor extends Constructors{
	 int num;
	
	StringConstructor (){
		this("betul");
		this.num=10;
	    System.out.println("hi"+num);
	}
	StringConstructor(String a){
		this("betul","temiz");
		System.out.println("hello "+a);
		
	}
	StringConstructor(String a, String b){
		
		System.out.println("Hello "+a+" hi "+b);
		}
	  {
	super.display();
	System.out.println("I am in child class");
	}
	public static void main(String[] args) {
	StringConstructor obj=new StringConstructor();
	obj.display();
	
	}
	
	

}
