package com.Inheritance;

public class Parent {
	
	
	String reverse(String str) {
		String rev="";
		for(int i=str.length()-1;  i>=0; i--) {
			rev=rev+str.charAt(i);
			}
		
		return rev;
	}
	
	String reverse(String str,String a) {
		String rev="";
		for(int i=str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i)+a.charAt(i);
			
		}
		
		return rev;
	}
	static boolean display(boolean a,boolean b) {
		boolean flag=false;
		if(a==true&&b==true) {
			flag=false;
		}else if(a==false && b==true){
			flag=true;
			
		}else if(a==true && b==false){
			flag=false;
			
		}else {
			flag=true;
		}
		
	
		return flag;
	}
	

}
