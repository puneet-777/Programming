package com.puneet.String;

public class SwapFirstandLast {
	public static void main(String[] args) {

		String s = "hello world";

		char[] ch = s.toCharArray();
		
		int start=0;
		for(int i=0;i<=ch.length;i++)
		{
			if(i==ch.length || ch[i]==' ')
			{
				int end=i-1;
				if(end>start)
				{
					char temp=ch[start];
					ch[start]=ch[end];
					ch[end]=temp;
				}
				start=i+1;
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}

	}

}
