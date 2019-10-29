package JavaInterview;

public class Palindrome {
//	6.Write a Java Program to find whether a String is palindrome or not.
	
	public static void main(String[] args) {
		
		String str="Hanas";
		String rev="";
		for (int i=str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
			}
		
		if(rev.equalsIgnoreCase(str)) {
			System.out.println("it is polindrome");
		}else{
			System.out.println("it is not polindrome");
		}
		
	}

}
