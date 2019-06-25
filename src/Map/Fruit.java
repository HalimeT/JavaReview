package Map;

import java.util.*;
public class Fruit {

	public static void main(String[] args) {
		Map<String,Integer> map=new TreeMap<>();
		map.put("Orange",5);
		map.put("banana",7);
		map.put("apple",5);
		//map.put("apple",8);
		map.replace("apple", 17);
		map.put("kiwi",15);
		
		// Set<String> mapset=map.keySet();
		 for(String key:map.keySet()) {
			 System.out.println(key);
			 
		 }
		 Iterator<String> it=map.keySet().iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		
		Collection<Integer> coll=map.values();
		 for(Integer value:coll) {
			 System.out.println(value);
			 
		 }

	}

}
