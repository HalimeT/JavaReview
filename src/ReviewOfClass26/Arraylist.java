package ReviewOfClass26;

import java.util.ArrayList;

import java.util.Iterator;

public class Arraylist {
	
      public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(9);
		numbers.add(13);
		numbers.add(7);
		int count=0;
		for( int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
			
		}
	
		for (int i:numbers) {
			System.out.println(i);
			
		}
		
		
		while(numbers.size()>count) {
			System.out.println(numbers.get(count));
			count++;
		}
		
			int count1=0;	
		
		do {
			System.out.println(numbers.get(count1));
			count1++;
			
		}while(numbers.size()>count1);
		
	   Iterator it=numbers.iterator();
	 
	   while(it.hasNext()) {
		 System.out.println(it.next());
	 }
		
		
		
	}

}
