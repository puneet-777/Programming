package me;


public class pr {
	
	public static boolean isPallindrome(String s)
	{
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		return rev.equals(s);
	}
	public static void main(String[] args) {

		String s1 = "abacaba";
		int maxlength=0;
		String res="";
		
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i;j<s1.length();j++)
			{
				String sub=s1.substring(i,j);
				if(isPallindrome(sub))
				{
					if(sub.length()>maxlength)
					{
						maxlength=sub.length();
						res=sub;
					}
				}
			}
		}
		System.out.println(res);
		
	}
}