package dsa;


public class MergeArray {


public static void main(String[] args) {
	
	int input[]= {3,8,18,23};
	int input1[]= {4,5,15};
	int sort[]=new int[input.length+input1.length];
	
	int i=0;
	int j=0;
	int k=0;
	
	while(i<input.length && j<input1.length)
	{
		if(input[i]<input1[i])
		{
			sort[k]=input[i];
			i++;
		}
		else {
			sort[k]=input1[j];
			j++;
		}
		k++;
	}
	while(i<input.length)
	{
		sort[k]=input[i];
		i++;k++;
	}
	while(j<input1.length)
	{
		sort[k]=input1[j];
		i++;k++;
	}
		for(int ele:sort)
		{
			System.out.println(ele+" ");
		}
}
}
