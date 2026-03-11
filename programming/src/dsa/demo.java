package dsa;

public class demo {
	public static String reverse(String w) {
		String rev="";
		for(int i=0;i<w.length();i++) {
			rev=w.charAt(i)+rev;
		}
		return rev;
	} 
	
	public static void main(String[] args) {
		
		String s="Hello world in from java pun";
		String str[]=s.split(" ");
		String res="";
		
		for(int i=0;i<str.length;i++) {
			String w=str[i];
			if(w.length()%2!=0) {
				String rev=reverse(w);
				res=res+rev+" ";
			}
			else {
				res=res+w+" ";
			}
		}
		System.out.println(res);
	}
}
