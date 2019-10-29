package JavaInterview;

public class NullPointerr {

	public static void main(String[] args) {
		String msg = "Hello";
        boolean [] flag = new boolean[1];
        System.out.println(flag[0]);
        if(flag[0]) {
            msg = "Welcome";
        }
        System.out.println(msg);
	}

}
