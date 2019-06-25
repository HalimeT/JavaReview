package com.Review11;

public class ExceptionsReview {
	

	 static void arithmetic(int a, int b) {
		int div=a/b;
		System.out.println(div);
	}
	
public static void main(String[] args) {
		
		
		try {
		arithmetic(9, 0);
		}catch(ArithmeticException a){
			System.out.println("ArithmeticException");
		}
	}

	}
