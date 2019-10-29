package JavaInterview;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class arrayPredicate {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
        list.add(110);
        list.add(new Integer(110));
        list.add(110);

        list.removeIf(i -> i == 110);
        System.out.println(list);
        
     System.out.println("hello");
            
          //  LocalDate obj = new LocalDate(2020, 2, 14); LocalDate in boyle bir constructori yok.
           // System.out.println(obj.minus(Period.ofDays(10)));

	}

}
