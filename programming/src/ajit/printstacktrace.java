package ajit;

public class printstacktrace {
	
	public static void main(String[] args) {
		try {
			String string=null;
			System.out.println(string.charAt(7));
		}catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}
	}
}
