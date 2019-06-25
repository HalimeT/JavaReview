package JavaInterview;

public class howmanyPartOfString {

	public static void main(String[] args) {
// 4.How to findout the part of the string from a string?
		
//		String str="How to find out the part of the string from a string";
//		 String part=str.substring(20);
//		 System.out.println(part);
		
		//What is substring?
		
		
		
		
		
		//find number of words in string?
//		String[] array=str.split(" ");
//		System.out.println("number of word:"+array.length);
//
//		
		
		
		String str="hello world hi bye";
		
		String[] arr=str.split(" ");
		
		for(String word:arr) {
			System.out.println(word);
			
		}
		System.out.println(arr.length);
		
		String sub=str.substring(0,11);
		String sub2=str.substring(12);
		System.out.println(sub);
		System.out.println(sub2);
		
		
		
		//substring() is a method for string that cut it out from string based on indexs.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
