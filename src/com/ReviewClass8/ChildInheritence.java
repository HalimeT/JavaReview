package com.ReviewClass8;
class MainInheritence {
//	* I want you to create two classes one called MainInherintence and ChildInherintence
//    *
//    * in your main class i want you to create 1 method to swap numbers, and another to swap strings
//    *
//    * and in your child i want you to extend main, and i want you to create the same methods, and paramters, but in the block of code
//    * i want you to print "not reversing" for swap numbers, and print 2 "not reversing" swap String
//    *
	
	
	public void swapNumbers(int a, int b) {
		a=b+a;
		b=a-b;
		a=a-b;
		
		System.out.println("a="+a+" "+"b="+b);
	}
	public void swapWords(String str, String str1) {
		String tot;
		tot=str+str1;
		str1=tot.substring(0,str.length());
		str=tot.substring(str.length());
		System.out.println("str="+str+" "+"str1="+str1);
	}
}
public class ChildInheritence extends MainInheritence{
	
	    void parentNumbers(int a, int b) {
	        super.swapNumbers(a, b);
	        System.out.println("no reverse");
	    }

	    void parentString(String a, String b) {
	        super.swapWords(a, b);
	        System.out.println("no reverse");
	        
	    }
	
	public static void main(String[] args) {
		ChildInheritence cc=new ChildInheritence();
		cc.parentNumbers(10, 20);
		cc.parentString("hellobye", "bye");
		
	}
	
	
	
	
	
	
}
