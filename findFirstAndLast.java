
public class findLastAndFirstOcc {
	public static int first(int[] arr,int low,int high,int x,int n)
	{
		if(high>=low)
		{
			int mid = (low+high)/2;
			//boundary checks
			if((mid == 0)||(arr[mid]!=arr[mid-1]))
			{
				return mid;
			}
			
			else if(arr[mid]>x)
			{
				return first(arr, low, mid-1, x, n);
			}
			else
			{
				return first(arr, mid+1, high, x, n);
			}
		}
		return -1;
	}
	
	public static int last(int arr[],int low,int high,int x,int n)
	{
		if(low<=high)
		{
		int mid = (low+high)/2;
		if((mid == n-1)||arr[mid]!=arr[mid+1])
		{
			return mid;
		}
		else if(arr[mid]<x)
		{
			//right
			return last(arr,mid+1,high,x,n);
		}
		else
		{
			return last(arr,low,mid-1,x,n);
		}
	}
		return -1;

}
	public static void main(String[] args) {
		int arr[] = {2,2,2,2};
		System.out.println(first(arr,0,arr.length, 2, arr.length)+last(arr,0,arr.length, 2,arr.length));
	}
}

	
