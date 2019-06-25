package com.Review10;

import java.util.*;

public class TestMarketing  {

	public static void main(String[] args) {
	 Map<String,Marketing> map=new HashMap<>();
	 map.put("John",new Marketing("John","towel",3000.00));
	 map.put("Jane",new Marketing("Jane","shoes",4000.00));
	 map.put("Jack",new Marketing("Jack","furniture",5000.00));
	 map.put("Jessy",new Marketing("Jessy","towel",6000));
	 map.put("Sara",new Marketing("Sara","curtain",2000));
	 map.put("Tara",new Marketing("Tara","carpet",3000));
	 map.put("Nora",new Marketing("Nora","sofa",1000));
	 map.put("Dora",new Marketing("Dora","table",2000));
	 
	 for (String key : map.keySet()) {
    Marketing m = map.get(key);
             if (m.getSaleAmount() > 3000)
             System.out.println(m.toString());
   }
	       System.out.println("--------------------------------------------------------------");
        Iterator<String> it= map.keySet().iterator();
        while(it.hasNext()) {
        	Marketing obj=map.get(it.next());
        	if(obj.getSaleAmount()>3000) {
        		System.out.println(obj.toString());
        		
        		
        	}
        	
        }

	}

}
