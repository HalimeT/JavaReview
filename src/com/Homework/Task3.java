package com.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Task3 {

	public static void main(String[] args) {
		//3. Create an HashSet of cities and add duplicates into it.
	    //Retrieve all values from hashset in 2 different ways.
	    //Retrieve all values in alphabetical order.
		
		Set<String> cities=new HashSet<>();
		cities.add("Dallas");
		cities.add("Houston");
		cities.add("Auston");
		cities.add("Dallas");
		
		
		System.out.println(" 1st Way to retrieve all values of hashSet");
		for(String city:cities) {
			System.out.println(city);
		}
		System.out.println(" 2st Way to retrieve all values of hashSet");
		Iterator<String> cc=cities.iterator();
		while(cc.hasNext()) {
			System.out.println(cc.next());
		}
		//convert Hashset collection in to the List Collection
		List<String>str=new ArrayList<String>(cities)	;	
		Collections.sort(str);
        System.out.println(str);
        
	}

}
