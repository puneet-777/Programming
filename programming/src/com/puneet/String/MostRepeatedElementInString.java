package com.puneet.String;

public class MostRepeatedElementInString {

	public static void main(String[] args) {
		String s="PuneetJaiswal";
		char[] ch=s.toCharArray();
		boolean b[]=new boolean[ch.length];
		char mostrep=' ';
		int maxfreq=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(b[i]==false)
			{
			int count=1;
			for(int j=i+1;j<ch.length;j++ )
			{
				if(ch[i]==ch[j])
				{
					count++;
					b[j]=true;
				}
			}
			
			if(count>maxfreq)
			{
				maxfreq=count;
				mostrep=ch[i];
			}
				
				
			}
			
		}System.out.println(mostrep);
	}
	}


