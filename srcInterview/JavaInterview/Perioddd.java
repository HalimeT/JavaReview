package JavaInterview;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Perioddd {

	public static void main(String[] args) {
		
    LocalDate birthday=LocalDate.of(1987,5,5);
    LocalDate today=LocalDate.now();
    
    Period p=Period.between(birthday,today);
    System.out.printf("your age is %d years %d months and %d days...", p.getYears(),p.getMonths(),p.getDays());
    
    LocalDate deathday=LocalDate.of(1987+60,5,5 );
    Period pp=Period.between(today,deathday);
    int dd=pp.getYears()*365+pp.getMonths()*30+pp.getDays();
    System.out.printf(" you have %d days left to die",dd);
    System.out.println("");
		
    LocalDate date = LocalDate.of(2000, Month.JANUARY, 1);
    Period period = Period.parse("p-30000y");
    System.out.println(date.plus(period));	
    
    String s1="Hello";
    String s2=new String("Hello");
    		System.out.println(s1 == s2);
    		System.out.println(s1.equals(s2));
		
	}

}
