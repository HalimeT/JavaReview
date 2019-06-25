package Homework;

import java.util.*;

public class DrinksHashSet {

	public static void main(String[] args) {
		Set<String> drinks=new HashSet<String>();
		drinks.add("milk");
		drinks.add("juice");
		drinks.add("ayran");
		
		for(String str:drinks) {
		if(str.contains("e")||str.contains("a")) {
			str.replace(str,"water");
			}
		}
	System.out.println(drinks);
		
	
	Iterator <String> it=drinks.iterator();
	while(it.hasNext()) {
		String str=it.next();
		if(str.contains("e")||str.contains("a")) {
			str.replace(str,"water");
			}
		}
	System.out.println(drinks);

	}

}
