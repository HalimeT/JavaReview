package com.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		//1. Create an ArrayList of Strings and using Collections class sort the values of that ArrayList.
       
		List<String> list=new ArrayList<>();
		list.add("April");
		list.add("May");
		list.add("June");
		list.add("February");
		
		Collections.sort(list);
		//System.out.println(list);
		
		//2. Create an array of Strings and using Arrays class  class sort the values of that array of Strings.
		
		 String[] months={"may","april","july"};
		 Arrays.sort(months);
	    for(String str:months) {
	    	System.out.print(str+" ");
	    	
	    }
	}

}
