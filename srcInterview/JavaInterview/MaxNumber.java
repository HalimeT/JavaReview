package JavaInterview;

import java.util.Arrays;

public class MaxNumber {
	public static void main(String[] args) {
		//max num from array efficient way
		
//		int max=0;
//		int min=0;
//		int secmax=0;
//		int[] numbers= {-2,0,56,77,89,4,129,-3,-1};
//		
//		
//		for(int num:numbers) {
//			if(num>=max) {
//				max=num;
//				
//			}else if(num<=min){
//				min=num;
//				
//				}
//			
//		}
//		System.out.println(max);
//		System.out.println(min);
//		
//		
//		//secmax num from array efficient way
//		for(int num:numbers) {
//			if(num>secmax&& num<max) {
//				secmax=num;
//				
//			}
//		}System.out.println("second max:"+secmax);
//		
		//2 more efficient way
		int[] numArray= {12,13,12,15,0, -1,7};
		int smallest=0;int biggest=0;
		for(int i=0; i<numArray.length; i++) 
		{
			if (numArray[i]>biggest){
				biggest=numArray[i];
		
		}else {
			smallest=numArray[i];
			}
		}
		System.out.println(smallest);
		System.out.println(biggest);
			
			
		
		
		
	
	//easy way for max
//	Arrays.sort(numbers);
//	int minimum=numbers[0];
//	int maximum=numbers[numbers.length-1];
//	System.out.println(minimum);
//	System.out.println(maximum);
//	
	//easy way for second max
//	int secondmaximum=numbers[numbers.length-2];
//	System.out.println("second max:"+secondmaximum);
	
	}
}