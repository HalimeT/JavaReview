package Map;
import java.util.*;
import java.util.Map.Entry;
public class MapFruit {

	public static void main(String[] args) {
		Map<String,Integer> map=new LinkedHashMap<>();
		map.put("Orange",5);
		map.put("banana",7);
		map.put("apple",5);
		//map.put("apple",8);
		map.replace("apple", 17);
		map.put("kiwi",15);
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map.get("apple"));
		
		
	//	Set<Map.Entry<String, Integer>> fruit=map.entrySet();
		
		for(Entry<String, Integer> entryFruit:map.entrySet()) {
			String str=entryFruit.getKey()+":"+entryFruit.getValue();
			System.out.println(str);
		}
		
		Iterator<Entry<String, Integer>> it=map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, Integer> entry=it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
		

	}

}
