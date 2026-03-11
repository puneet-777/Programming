package dsa;
//reverse the arraylist
//merge two arraylist
import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		ArrayList<Integer> aList=new ArrayList<Integer>();
		aList.add(13);
		aList.add(14);
		aList.add(13);
		ArrayList<Integer> aList2=new ArrayList<Integer>();
		aList2.add(15);
		aList2.add(11);
		aList2.add(15);
	
		ArrayList<Integer> aList3=new ArrayList<Integer>();
		
		for(int n:aList)
		{
			
		if(!aList3.contains(n))
		{
			aList3.add(n);
		}
		}
		for(int n:aList2)
		{
			
			if(!aList3.contains(n))
			{
				aList3.add(n);
			}
		}
		System.out.println(aList3);
	
}
}