package com.Review11;

import java.util.ArrayList;

public class NegativeArraySize {

	public static void main(String[] args) {
		 
		
	        try {
	        	int[] arr=new int[-5];
	        }catch(NegativeArraySizeException nn) {
	           System.out.println(nn.getMessage());
	           System.out.println("NegativeArraySizeException is caught");
	        }
	}
  
}
