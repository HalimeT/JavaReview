package JavaInterview;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Test2 {
	 private static void m(int x) {
         System.out.println("int version");
     }
 
     private static void m(char x) {
         System.out.println("char version");
     }
 
     public static void main(String [] args) {
       //  int i = '5';
      //   m(i);
         m('5');
     ///dikkat args olmamali
       // short [] arg  = new short[]{50, 50};
         short[] arg;
         arg=new short[2];
         arg[0] = 5;
         arg[1] = 10;
         System.out.println("[" + arg[0] + ", " + arg[1] + "]");
     
     //question bak bunaaa
         String s1 = "OCAJP";
         String s2 = "OCAJP"+"";
         System.out.println(s1 == s2);
         
       //question
         double price = 90000;
         String model;
         if(price > 100000) {
             model = "Tesla Model X";
         } else if(price <= 100000) {
             model = "Tesla Model S";
         }
        //
        
         //
         List<String> lista = new ArrayList<>();
         lista.add("A");
         lista.add("D");
 
         List<String> listb = new ArrayList<>();
         listb.add("B");
         listb.add("C");
 
         lista.addAll(1, listb);
 
         System.out.println(lista);
         //question neden hepsiii?
         String fruit = "mango";
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
         
         
         
         List<String> list = new ArrayList<>();
         list.add("ONE");
         list.add("TWO");
         list.add("THREE");
         list.add("THREE");
         System.out.println(list.remove("TWO"));
         System.out.println(list.remove(1));
         
         Boolean [] arra=new Boolean[4];
         arra[0]=true;
         arra[3]=true; 
         for(int i=0; i<arra.length; i++) {
        	 System.out.print(arra[i]+" ");
         }
         System.out.println();
         boolean [] array=new boolean[4];
         array[0]=true;
         array[3]=true;
         for(int i=0; i<array.length; i++) {
        	 System.out.print(array[i]+" ");
         }
         
//         List<Boolean>listt=new ArrayList<>();
//         listt.add(0,true);
//         listt.add(3,true);
//         System.out.println(listt);
         
         Boolean b1=new Boolean(Boolean.parseBoolean("tRue"));
         System.out.println(b1);
          
         List colors=new ArrayList();
         colors.add("red");
         colors.add(5);
         
         /////
        LocalDate date=LocalDate.now();
         System.out.println(date);
         LocalDateTime obj = LocalDateTime.now();
         System.out.println(obj.getSecond());
         
         ArrayList<Integer> a= new ArrayList<>();
         a.add(1);
         a.add(2);
         a.add(3);
         a.add(null);
         a.add(5);
         a.remove(2);
         a.remove(null);
         System.out.println(a.indexOf(3));
         System.out.println(a);
         
         Short c1=200;
         Integer c2=400;
         Long c3=(long)c1+c2;
   //      String c4=(String)(c3*c2);  Cannot cast long to String!!!!
         
         
     } 
     
     }


