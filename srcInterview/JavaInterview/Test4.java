package JavaInterview;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

class Message {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}

public class Test4 {
    public static void change(Message m) {
        m.msg = "Happy Holidays!";
    }

   public  static  void main(String[] args) {
        Message obj = new Message();
        obj.print();
        change(obj);
        obj.print();
        LocalDate date = LocalDate.of(2018,1,1);
        System.out.println(date);
        
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = "Java";

        System.out.println(s1 == s2);
        
        long l = 100_00l;
        int i = 100;
        float f = 2.02f; 
        double d = 10_0.35d;
        f = l;
        d = l;
   //     f = d;
        d = f;
        f = i;
     //   i = f;
        i = (int)d;
        
        Period period = Period.of(2, 1, 0).ofYears(10).ofMonths(5).ofDays(2);
        System.out.println(period);
        
        int a = 2;
        boolean res = false;
        res = a++ == 2 && --a == 2 && --a == 2;
        System.out.println(a);
        
        List<String> days = new ArrayList<>();
        days.add(new String("Sunday"));
        days.add(new String("Monday"));
        days.add(new String("Tuesday"));
        if(days.contains(new String("Sunday"))) {
            days.add(new String("Wednesday"));
        }
        
 
        System.out.println(days);
        
        int x = 5;
        while (x < 10) { 
            System.out.println(x);
            x++;
        }
        //question
        List<String> trafficLight = new ArrayList<>();
        trafficLight.add(0, "YELLOW");
        trafficLight.add(1, "RED");
        trafficLight.add(2, "ORANGE");
        trafficLight.add(3, "GREEN");

        trafficLight.remove("RED");

        System.out.println(trafficLight);
        
        LocalDate dates = LocalDate.parse("2018-06-06");
        LocalDate dat = LocalDate.of(2011,9,9);
        System.out.println(dates);
        System.out.println(dat);
       
        //
       
        System.out.println(dates.minusDays(10));
        //System.out.println(date);
        
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
        
        
        //question
        Throwable ob = new Error();
        boolean flag1 = ob instanceof RuntimeException; //Line n1
        boolean flag2 = ob instanceof Exception; //Line n2
        boolean flag3 = ob instanceof Error; //Line n3
        boolean flag4 = ob instanceof Throwable; //Line n4
        System.out.println(flag1 + ":" + flag2 + ":" + flag3 + ":" + flag4);

        //question
         final int k = 100;
      //   static int j = 200;
    }
}


