package JavaInterview;
class Supe {
    public Supe(int i) {
        System.out.println(100);
    }
}

class Su extends Supe {

	public Su(int i) {
		super(i);
		
	}
 //   public Su() {
 //     System.out.println(200);
  //  }
}

public class Testtt {
    public static void main(String[] args) {
       // new Sub();
    try {	
    System.out.println(10/0);
    }finally {
    	System.out.println("A");
    }	
    	
    }
}

