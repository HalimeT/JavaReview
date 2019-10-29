package JavaInterview;

import java.util.ArrayList;
import java.util.List;

class Super {
	Super(){}
    public Super(int i) {
        System.out.println(100);
    }
}

class Sub extends Super {
    public Sub() {
    	
     System.out.println(200);
    }
}

public class Test5 {
    public static void main(String[] args) {
    	 StringBuilder sb = new StringBuilder("SpaceStation");
         sb.delete(5, 6).insert(5, "K").toString();
         System.out.println(sb);
         
         
         //question
         List<String> dryFruits = new ArrayList<>();
         dryFruits.add(new String("Walnut"));
         dryFruits.add(new String("Apricot"));
         dryFruits.add(new String("Almond"));
         dryFruits.add(new String("Date"));
 
         for(int i = 0; i < dryFruits.size(); i++) 
         {
             if(i == 0) {
                 dryFruits.remove(new String("Almond"));
             }
          }
 
         System.out.println(dryFruits);
     }
    }



