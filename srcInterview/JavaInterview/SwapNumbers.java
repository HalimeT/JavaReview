package JavaInterview;

public class SwapNumbers {
	public static void main(String[] args) {
		//swap two numbers
		int a=19;
		int b=10;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		//swap two strings
		String x="hello";
		String y="byeeeee";
		
		x=x+y;//hellobyeeeee
		
		y=x.substring(0, x.length()-y.length());//0,(7-3)__>0,4
		x=x.substring(y.length());
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
		
	}

}
