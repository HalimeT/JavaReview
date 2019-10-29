package JavaInterview;

public class staticQuestion {
	 static int a=1;
	    
	    static {a=a-- - --a;}
	    
	    public static void main(String[] args) {
	        System.out.println(a);
	        {a=a++ + ++a;}
	        System.out.println(a);    
	    }

}
