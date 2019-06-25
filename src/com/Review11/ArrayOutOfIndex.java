package com.Review11;

public class ArrayOutOfIndex {
	
	public  void exception(String[] str){
		
		System.out.println(str[str.length]);
	}

	public static void main(String[] args) {
		ArrayOutOfIndex obj=new ArrayOutOfIndex();
		String[] arr= {"hi","hello","bye"};
		
		try {
			obj.exception(arr);
		}catch(ArrayIndexOutOfBoundsException aa) {
			System.out.println("it is ArrayIndexOutOfBoundsException ");
		}
		
	}

}
