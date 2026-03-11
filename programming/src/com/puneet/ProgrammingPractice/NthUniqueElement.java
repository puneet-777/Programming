package com.puneet.ProgrammingPractice;

public class NthUniqueElement {

	public static void main(String[] args) {
		
		String s="puneetjaiswalrewaeftt";
		char ch[]=s.toCharArray();
		boolean b[]= new boolean[ch.length];
		int unique=2;
		int temp=0;
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
				if(count==1)
				{
					temp++; 
					if(unique==temp)
					{
						System.out.println(ch[i]+ " is "+unique+"nd"+" unique "+ "count is "+count);
						break;
					}
				}
			}
		}
	}

}
