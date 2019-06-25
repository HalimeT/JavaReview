package com.Review11;

public class TaskStringB {

	public static void main(String[] args) {
//		* Write a program to concatenate or append 'def' to string 'abc' using
//        * StringBuffer and string 'ghi' to the concatenated string 'abcdef' using
//        * String builder.
		
		
		String str="abc";
		String str1=str.concat("abc");
		System.out.println(str);
		System.out.println(str1);
		
		StringBuffer s=new StringBuffer(str);
		s.append("def");
		
		System.out.println(s);
		
		StringBuilder bb=new StringBuilder(s);
        bb.append("efg");
        System.out.println(bb);
	}

}
