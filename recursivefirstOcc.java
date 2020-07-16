
public class findFirstOccurrence {
	public static int findFOcc(int arr[],int low,int high,int x)
	{
		int mid = (low+high)/2;
		if(low>high)return -1;
		//calcukate mid
	
		else if(arr[mid] <x)
		{
			//right bs 
			return findFOcc(arr, mid+1, high, x);
		}
		else if(arr[mid]>x)
		{
			return findFOcc(arr, low, mid-1, x);
		}
		else
		{
			//mid 
			if(mid == 0||arr[mid]!=arr[mid-1]){
				return mid;
			}
			return findFOcc(arr,low, high, x);
		}
	}
	public static void main(String[] args) {
		int arr[] = {0,0,0,0,0};
		System.out.println(findFOcc(arr,0,arr.length-1, 0));
	}

}
