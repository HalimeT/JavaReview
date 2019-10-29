package JavaInterview;

import java.time.Year;
import java.util.Scanner;

public class PYear {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please, enter year number");
		
		int n=sc.nextInt();
		
		Year y=Year.of(n);
		boolean leap=y.isLeap();
		System.out.println("is it leap year:"+leap);
		
//		if(y.isLeap(n)) {
//			System.out.printf(" %d is leap year",n);
//		}else{
//			System.out.printf(" %d is not leap year",n);
//			
//		}
        String fruit = "mango";
        switch (fruit) {
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
            default:
                System.out.println("ANY FRUIT WILL DO");
        }
		
		
		

	}

}
