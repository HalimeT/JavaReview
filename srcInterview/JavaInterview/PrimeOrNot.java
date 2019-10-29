package JavaInterview;

public class PrimeOrNot {

	public static void main(String[] args) {
		// 7.Write a java program to check whether a given number is prime or not?
		int num=99;
		boolean flag=false;
		for(int i=2; i<=num/2; i++) {
		if(num%i!=0) {
			flag=true;
			
		}else{
			flag=false;
		}
		
		}
		System.out.println(flag);
	}

}
