package com.Review11;

public class NullpointerException {


	public static void main(String[] args) {
		
		try {
			nullpointer(null);
		}catch(NullPointerException nn) {
			System.out.println("it is NullpointerException");
			
		}finally {
			System.out.println("it is finally block");
		}
	}
    public static void nullpointer(String str) {
	    System.out.println(str.length());
}
}
