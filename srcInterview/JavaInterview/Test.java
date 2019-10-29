package JavaInterview;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }
}

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 25));
        students.add(new Student("James", 25));

        students.remove(new Student("James", 25));

        for(Student stud : students) {
            System.out.println(stud);
        }
        
//        List<Integer> list = new ArrayList<>();
//        list.add(100);
//        list.add(200);
//        list.add(100);
//        list.add(200);
//        list.remove(100);
//
//        System.out.println(list);
        
       //question 
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(new Integer(2));
        list1.add(new Integer(1));
        list1.add(new Integer(0));

        list1.remove(list1.indexOf(0));

        System.out.println(list1);
        //question
        String s = new String("Hello");
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(new String("Hello"));
        list.add(s);
        s.replace("l", "L");

        System.out.println(list);
        //question
        LocalDate newYear = LocalDate.of(2018, 1, 1);
        LocalDate christmas = LocalDate.of(2018, 12, 25);
        boolean flag1 = newYear.isAfter(christmas);
        boolean flag2 = newYear.isBefore(christmas);
        System.out.println(flag1 + ":" + flag2);
        
        //question
        int a = 100;
        System.out.println(-a++);
        
        //
       // StringBuilder sb = new StringBuilder();
       // System.out.println(sb.append(null).length());
        
        //question infinite loop
//        int x = 1;
//        while(checkAndIncrement(x)) {
//            System.out.println(x);
//        }
//    }
//
//    private static boolean checkAndIncrement(int x) {
//        if(x < 5) {
//            x++;
//            return true;
//        } else {
//            return false;
//        }
        
        
        
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");
//QUESTION
        Iterator<String> iterator = dryFruits.iterator();
        while(iterator.hasNext()) {
            String dryFruit =iterator.next();
            if(dryFruit.startsWith("A")) {
       //        dryFruits.remove(dryFruit);
            }
        }
        
        
        // 
        ListIterator<String> it = dryFruits.listIterator();
        while(it.hasNext()) {
            if(it.next().startsWith("A")) {
                it.remove();
             }
        }
        System.out.println(dryFruits);
        
        //question
        StringBuilder sb = new StringBuilder(1009);
        System.out.println(sb.length() + ":" + sb.toString().length());

        //question
        LocalDate date = LocalDate.parse("1947-08-14");
        LocalTime time = LocalTime.MAX;
        System.out.println(date.atTime(time));
        
       //question 
        
        do {
            System.out.println(100);
        } while (false);
        System.out.println("Bye");
        
        List<Integer> lis = new ArrayList<>();
        lis.add(100);
        lis.add(200);
        lis.add(100);
        lis.add(200);
        lis.remove(new Integer(100));

        System.out.println(lis);
    }
}
