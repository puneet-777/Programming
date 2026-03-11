package dsa;

//LOOK AND SAY
public class CountAndSay {

	public static void main(String[] args) {
		
		int n=45;
		
		System.out.println(countAndSay(n));
	}

	public static String countAndSay(int n) {
		
		if(n==1) {
			return "1";
		}
		String term="1";
		for(int i=2;i<=n;i++){
			term=nextTerm(term);
		}
		return term;
	}
	public static String nextTerm(String term) {
		
		int count=1;
		String result="";
		
		for(int i=0;i<term.length();i++) {
			
			if(i+1<term.length() && term.charAt(i)==term.charAt(i+1)) {
				count++;
			}
			else {
				result+=count+""+term.charAt(i);
				count=1;
			}
		}
		return result;
	}

}
