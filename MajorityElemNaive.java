
public class findMajority {
	public static int findMajor(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int count = 1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j] == arr[i])
				{
					count++;
				}
			}
			if(count>n/2)return i;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		System.out.println(findMajor(arr, arr.length));
	}

}
