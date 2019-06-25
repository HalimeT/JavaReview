package JavaInterview;

public class howManyAlphaChrarcter {
	public static void main(String[] args) {
		//3.Find out how many alpha characters present in a string?
		
		String str="anhga2879999a@#$HNjAH";
		String replaced=str.replaceAll("[^A-Za-z]", "");
		System.out.println(replaced.length());
	}

}