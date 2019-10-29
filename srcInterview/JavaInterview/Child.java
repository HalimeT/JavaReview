package JavaInterview;

class Parent
{
	
	private void m1()
	{
		System.out.println("Parent Method");
	}
	
	
}
public class Child extends Parent{
       Child(){
    	   
	  
}

	private void m1()
	{
		System.out.println("Child Method");
	}

	public static void main(String[] args) 
	{
		Child p=new Child();
		System.out.println();
		
		int[][] arr= {{1,2},{3,4}};
		System.out.println(arr);
		
		Integer [] a=new Integer[2];
		
		
		int [] a1=new int[2];
		System.out.println(a[0].intValue());
		System.out.println(a1[0]+a1[1]);
	}
}

