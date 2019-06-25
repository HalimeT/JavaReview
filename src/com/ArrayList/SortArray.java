package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class SortArray {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0; i<20; i++) {
			list.add(i);
		}System.out.println(list);
		
		Iterator<Integer> num=list.iterator();
		while(num.hasNext()) {
			int a=num.next();
			if(a%2==1) {
				num.remove();
				
			}
			}
		System.out.println(list);
	}

}
