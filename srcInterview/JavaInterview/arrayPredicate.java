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
        
       // fo:
            for (int i = 2; i <= 100; i = i + 2) {
                for(int j = 1; j <= 10; j++) {
                    System.out.print(i * j + "\t");
                }
                System.out.println();
                if(i == 10) {
              //      break fo;
                }
            }
            
          //  LocalDate obj = new LocalDate(2020, 2, 14); LocalDate in boyle bir constructori yok.
           // System.out.println(obj.minus(Period.ofDays(10)));

	}

}
