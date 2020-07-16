
public class firstOccRec {
	public static int findFirst(int arr[],int n,int x)
	{
		int low = 0;
		int high = n-1;
		
		int mid =(low+high)/2;
		
		while(low<high)
		{
			if(arr[mid]<x)
			{
				low = mid+1;
			}
			else if(arr[mid]>x)
			{
				low = mid-1;
			}
			else
			{
				//handle the case when mid == x
				if(mid ==0||arr[mid]!=arr[mid-1])
				{
					return mid;
				}
				else
				{
					high = mid-1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {0,0,0,0,0,1};
		
		int res = findFirst(arr, arr.length, 0);
		System.out.println(res);
	}

}
