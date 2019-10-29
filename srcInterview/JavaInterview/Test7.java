package JavaInterview;

interface Interf
{
	default void m1()
	{
		System.out.println("interface default method");
	}
	
}
public class Test7 implements Interf
{
	public void m1()
	{
		System.out.println("Test class method");
	}
	public static void main(String[] args) 
	{
		Interf i = new Test7();
		i.m1();		
	}
}