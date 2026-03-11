package com.puneet.ProgrammingPractice;

public class MostRepeatedCharInString {

	public static void main(String[] args) {
		
		String s="puneetjaiswalrewaeftt";
		char ch[]=s.toCharArray();
		boolean b[]= new boolean[ch.length];
		 char mostrep=ch[0];
		 int maxcount=0;
		for(int i=0;i<ch.length;i++)
		{
			if(b[i]==false) 
			{
				int count=1;
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						b[j]=true;
					}
				}
				if(count>maxcount)
				{
					maxcount=count;
					mostrep=ch[i];
				}
			}
		}
		System.out.println("most repeated element is "+mostrep+" repeated "+maxcount+" times" );
	}

}
