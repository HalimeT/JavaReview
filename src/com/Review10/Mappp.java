package com.Review10;

import java.util.*;

public class Mappp {

	public static void main(String[] args) {
		// * Store the following key value pairs in a Map and
//        * (Sun,1), (Tue, 2), (Wed, 3), (Thu, 4), (Fri,5), (Sun,7)
//        * Write program to test if the map contains a mapping for the specified key(6).
          
		Map<String,Integer> map= new LinkedHashMap<>();
		map.put("Sun",1);
		map.put("Tue",2);
		map.put("Wed",3);
		map.put("Thu",4);
		map.put("Fri",5);
		map.put("Sun",7);
		boolean flag=false;
		for(Integer value:map.values()) {
			if(value==6) {
				flag=true;
			}
		}
		System.out.println(flag);
		
	}

}
