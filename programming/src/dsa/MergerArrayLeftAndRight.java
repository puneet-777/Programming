package dsa;

public class MergerArrayLeftAndRight {

	static void merge(int[] arr,int l,int h,int m)
	{
		int [] L=new int [m-l+1];
		int [] R=new int[h-m];
		int x=1;
		
		for(int i=0;i<R.length;i++)
		{
			L[i]=arr[x];
			x++;
			
		}
		for(int i=0;i<R.length;i++)
		{
			R[i]=arr[x];
			x++;
		}
		int i=0,j=0,k=1;
		
		while(i<L.length && j<R.length )
		{
			if(L[i]<R[j])
			{
				arr[k]=L[i];
				i++;
			}
			else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<L.length)
		{
			arr[k]=L[i];
			i++;k++;
		}
		while(j<R.length)
		{
			arr[k]=R[j];
			j++;k++;
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {7,6,2,4,14,8,9,15,1,11};
		  merge(arr,2,11,6);
		  for(int ele:arr)
		  {
			  System.out.println(ele+" ");
		  }
		  
		
	}
}
