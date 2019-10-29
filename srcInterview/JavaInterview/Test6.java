package JavaInterview;

public class Test6 
{
	Test6(Double I)
	{
		System.out.print(0);
	}
	Test6(int... i)
{
		System.out.print(1);
}
	Test6(float i)
	{
		System.out.print(5);
	}
	Test6(long i)
	{
		System.out.print(4);
	}
//	Test6(double d)
//	{
//		System.out.print(6);
//	}
	Test6(Object o)
	{
		System.out.print(3);
	}
	public static void main(String[] args) 
	{
		new Test6('a');//3  1
		new Test6(10);//0  1
		new Test6(10.5);//3  3
		
	//	char-int-long-float-double---Character--Object
	//	int-long-float-double--Integer--Object
	}
}