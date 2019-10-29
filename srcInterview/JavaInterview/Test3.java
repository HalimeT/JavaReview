package JavaInterview;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

//class MyLocalDate extends LocalDate {
//    @Override
//    public String toString() {
//        return super.getDayOfMonth() + "-" + super.getMonthValue() + 
//           "-" +  super.getYear();
//    }
//}

public class Test3 {
    public static void main(String [] args) {
//        MyLocalDate date = LocalDate.parse("1980-03-16");
//        System.out.println(date);
   
    	
//    	

//     List<Character> list = new ArrayList<>();
//         list.add(0, 'V');
//         list.add('T');
//         list.add(1, 'E');
//         list.add(3, 'O');
// 
//         if(list.contains('O')) {
//             list.remove('O');
//         }
// 
//         for(char ch : list) {
//             System.out.print(ch);
//         }
         //question
         
        String str = "java";
        StringBuilder sb = new StringBuilder("java");
        System.out.println(str.equals(sb) + ":" + sb.equals(str));
//         
         //question
//      remove(int)   
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("X");
        list.add("Y");
        list.add("Z");
        list.remove(new String("Y"));
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.remove(0));
        System.out.println(list);
    	
    	
    	
    	 String str1 = new String("Core");
         String str2 = new String("CoRe");
         System.out.println(str1 = str2);
         //question
         List<LocalDate> dates = new ArrayList<>();
         dates.add(LocalDate.parse("2018-07-11"));
         dates.add(LocalDate.parse("1919-02-25"));
         dates.add(LocalDate.of(2020, 4, 8));
         dates.add(LocalDate.of(1980, Month.DECEMBER, 31));
 
         dates.removeIf(x -> x.getYear() < 2000);
 
         System.out.println(dates);
    }}
      
   