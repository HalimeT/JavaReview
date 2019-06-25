package JavaInterview;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Write a Java Program to print first 10 numbers of Fibonacci series.
		// 1 1 2 3 5 8 13 21 34 55
		// a b c
		int  a=0;
		int  b=1; 
		int c;
		for(int i=0; i<10; i++ ) {
			System.out.print( a+" ");// 	
			 c=a+b;//
			 a=b;//
			  b=c;//
			  
			
		}

	}

}
