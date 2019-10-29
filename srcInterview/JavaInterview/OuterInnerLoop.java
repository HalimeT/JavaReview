package JavaInterview;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class OuterInnerLoop {
	 private static int [] arr;
	 
	 public void m1() throws IOException {
         throw new FileNotFoundException();
     }
	 
	 private static void add(double d1, double d2) {
         System.out.println("double version: " + (d1 + d2));
     }
 
     private static void add(Double d1, Double d2) {
         System.out.println("Double version: " + (d1 + d2));
     }
 
	public static void main(String[] args) {
		// add(10.0, new Double(10.0)); //it is ambiguis
		 add(10.0, 10.0);
		int i;
        outer: 
        do {
            i = 5;
            inner:
            while (true) {
                System.out.println(i--);
                if (i == 4) {
                    break outer;
                }
            }
        } while (true);
		
		final boolean flag;
        flag = false;
        while(flag) {
            System.out.println("Good Morning!");
        }
        
        
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("grape");

        if(fruits.remove("grape"))
            fruits.remove("apple");

        System.out.println(fruits);
       // LocalTime time = LocalTime.of(23, 60);
        //System.out.println(time);
        LocalDate date = LocalDate.of(2068, 4, 15);
        System.out.println(date.getMonth() + ":" + date.getMonthValue());
        
        
        String [] arr = {"abc", "TrUe", "false", null, "FALSE"};
        for(String s : arr) {
            System.out.print(Boolean.valueOf(s) ? "T" : "F");
        }
        
        Period period = Period.of(0, 1000, 0);
        System.out.println(period);
        
	}

}
