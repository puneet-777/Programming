package com.puneet.ProgrammingPractice;

public class FirstDupString {

	public static void main(String[] args) {
		
		String s="puneetjaiswalrewaeftt";
		char ch[]=s.toCharArray();
		boolean b[]= new boolean[ch.length];
		int dup=3;
		int value=0;
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
				if(count >1)
				{
					value++;
					if(dup==value)
					{
						System.out.println(ch[i] +" "+"count "+count);
						break;
					}
				}
			}
		}
	}

}
