package JavaInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import JavaC.Abc;

public class JavaCert extends Abc {
	public static void dosum(Integer x, Integer y) {
		System.out.println("Integer sum");
		
	}
public static void dosum(double x, double y) {
		System.out.println("double Sum");
	}

public static void dosum(float x, float y) {
	System.out.println("float sum");
	
}

public static void dosum(int x, int y) {
	System.out.println(" int summ");
}


	public static void main(String[] args) {
		
		
		dosum(10,20);
		dosum(10.0,20.0);
		
	
		
		
		
		
	String[][]chs=new String[2][];
		chs[0]=new String[2];
		chs[1]=new String[5];
		int i=97;
		for(int a=0; a<chs.length; a++) {
			for(int b=0; b<chs.length; b++) {
				chs[a][b]=" "+i;
				i++;
			}
			
		}
		for(String[] arr:chs) {
			for(String aa:arr) {
				System.out.println(aa);
				
			}
			
		}
		
		
		
		
		
	}

}
