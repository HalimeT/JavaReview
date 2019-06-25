package JavaInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapett {
	public static void main(String[] args) {
		
		
		Map<String,String> map1=new HashMap();
		map1.put("userName", "Adminjjj");
		map1.put("password", "Admin123");
		map1.put("errorMessage", "Invalid");
		
		Map<String,String> map2=new HashMap();
		map2.put("userName", "Adminjjj");
		map2.put("password", "Admin173");
		map2.put("errorMessage", "Invalidw");
		
		Map<String,String> map3=new HashMap();
		map3.put("userName", "Admin78");
		map3.put("password", "Admin3");
		map3.put("errorMessage", "Invalide");	
		
		List<Map<String,String>> list1=new ArrayList();
		list1.add(map1);
		list1.add(map2);
		list1.add(map3);
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i).get("userName"));
			System.out.println(list1.get(i).get("password"));
			System.out.println(list1.get(i).get("errorMessage"));
			
		}
	   
	   
	}

		
	}


