package JavaInterview;

public class Oracle {
	//object equals.//==
	public static void main(String[] args) {
		
		char [] ch= {'j','a','v','a'};
		
		byte[] arr= {97,98,99,100};//-127 +128
		byte[] ar= {1,2,3,4,-5};
		
		String str1=new String(arr);
		String str=new String(ch);
		System.out.println(str1);
		System.out.println(str);
		
		String s=new String("you cannot change me");
		String s1=new String("you cannot change me");
		System.out.println(s==s1);//false
		
		String s3="you cannot change me";
		String s4="you cannot change me";
		System.out.println(s3==s4);//true
		
		String s5="you cannot"+" change me";  //compile time da topluyor
		System.out.println(s4==s5);//true
		
		String s6="you cannot ";
		String s7=s6+"change me";//runtime topladigi icin yeni bir object olusuyor
		System.out.println(s4==s7);//false
		
		final String s8="you cannot ";
		String s9=s8+"change me";///constant variable lar compile time da topluyor//  
		System.out.println(s4==s9);//true
		
		String a="durga";
		String a1=a.toString();
		String a2=a.toLowerCase();
		String a3=a.toUpperCase();
		System.out.println(a==a1); //TRUE
		System.out.println(a==a2);//TRUE
		System.out.println(a==a3);//FALSE
		
		
		

		Boolean b1 = Boolean.valueOf(null);
		Boolean b2 = Boolean.valueOf(false);
		System.out.print((b1 == b2) + " ");
		System.out.print(b1.equals(b2));
		
		String c = new String("Bahubali");
		StringBuilder sb = new StringBuilder("Bahubali");
		//System.out.println(c==sb);
		System.out.println(c.equals(sb));
		
		
		StringBuilder sb1 = new StringBuilder("durga");
		StringBuilder sb2 = new StringBuilder("durga");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));

		
		
		//heap                // scp( string constant pool)
		//s--->yccm               s3-->  s4-->  s5-->   s9-->yccm
		// s1--->yccm            s6--> yc
		
		//s7-->yccm
		
		
		
		
	}

}
