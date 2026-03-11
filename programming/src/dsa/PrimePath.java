package dsa;

import java.util.*;

public class PrimePath{  
    public static void main(String[] args) {
        int count=0;
       ArrayList<Integer> aList=new ArrayList<Integer>();
       aList.add(12);
       aList.add(16);
       aList.add(15);
       aList.add(17);
       aList.add(0);
       aList.add(1);
       aList.add(0);
       ArrayList<Integer> result=new ArrayList<Integer>();
       for(int num:aList)
       {
    	   if(num !=0)
    	   {
    		 result.add(num);  
    	   }
    	   else {
			count++;
		}
       }
       for(int i=0;i<count;i++)
       {
    	   result.add(0);
       }
    	   System.out.println(result);
    }
}
