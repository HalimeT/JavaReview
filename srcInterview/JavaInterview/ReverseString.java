package JavaInterview;

public class ReverseString {

	public static void main(String[] args) {
		// 5.Write a java program to reverse String? Reverse a string word by word?
	//1st  with charAt or substring	
		String str="Welcome Everyone";
		String rev="";
		for(int i=str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
			}
		System.out.println(rev);
		
		
		//reverse a string word by word
	    String[] array=str.split(" ");
	    String reverse="";
	for(int i=array.length-1; i>=0; i--) {
			
			reverse=reverse+array[i]+" ";
		}
		
	   System.out.println(reverse);
	   
	   
	   //String Buffer
	   StringBuffer strbuff=new StringBuffer(str);
	  System.out.println(strbuff.reverse());
	  
	

	}

}
