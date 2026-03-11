package ajit;

public class customException extends Exception {

	public customException() {

	}

	public customException(String s) {
		super(s);
	}

}
class verify{
	static void verify(int n) throws customException{
		if(n%2==0) {
			customException e=new customException("my customException "+n+" div by 2");
			throw e;
		}
	}
}

 class mainclass{
	 
	public static void main(String[] args) {
		try {
			verify.verify(12);
		}catch (customException e) {
			e.printStackTrace();
		}System.out.println("==============");
	}
}

