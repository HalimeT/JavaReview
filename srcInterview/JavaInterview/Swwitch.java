package JavaInterview;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Swwitch {

	public static void main(String[] args) {
		byte var=100;
		switch(var) {
		case 100:
			System.out.println("var is 100");
			break;
		//case 200:
		//	System.out.println("var is 200");
		//	break;
		default:
			System.out.println("InValid");
		}
		
		
		
	     char v=7;
	         switch(v) {
	             case 7:
	                 System.out.println("Lucky no. 7");
	                 break;
	             default:
	                 System.out.println("DEFAULT");
	         }
	         
	         
	         StringBuilder sb = new StringBuilder(100);
	         System.out.println(sb.length() + ":" + sb.toString().length());
	         
	         
	         String str = "java";
	         StringBuilder sib = new StringBuilder("java");
	 
	         System.out.println(str.equals(sib) + ":" + sib.equals(str));
	         
	         Period period = Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2);
	         System.out.println(period);
	         
	         int a = 2;
	         boolean res = false;
	         res = a++ == 2 || --a == 2 && --a == 2;
	         System.out.println(a);
	         
	         int grade = 55;
	         if(grade > 60) {
	             System.out.println("Congratulations");
	             System.out.println("You passed");
	             
	         }else
	             System.out.println("You failed");
	         System.out.println("hello");
	         
	         
	         
	         
	         List<String> list = new ArrayList<>();
	         list.add("ONE");
	         list.add("TWO");
	         list.add("THREE");
	         list.add("THREE");
	 
	      //   if(list.remove(2)) {
	             list.remove("THREE");
	     //    }
	 
	         System.out.println(list);
	         
	         String fruit = new String(new char[] {'M', 'a', 'n', 'g', 'o'});
	         switch (fruit) {
	             default:
	                 System.out.println("ANY FRUIT WILL DO");
	             case "Apple":
	                 System.out.println("APPLE");
	             case "Mango":
	                 System.out.println("MANGO");
	             case "Banana":
	                 System.out.println("BANANA");
	                 break;
	         }

	     
	}

}
