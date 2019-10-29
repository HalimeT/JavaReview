package JavaInterview;

public class ExceptionsHandling {

	public static void main(String[] args) {
		
		 int $ = 80000;
         String msg = ($ >= 50000) ? "Good bonus" : "Average bonus";
         System.out.println(msg);
		  try {
	             System.out.println(1);
	         } catch (NullPointerException ex) {
	             System.out.println("ONE");
//	         } catch (FileNotFoundException ex) {
//	             System.out.println("TWO");
	         }
	         System.out.println("THREE");

	}

}
