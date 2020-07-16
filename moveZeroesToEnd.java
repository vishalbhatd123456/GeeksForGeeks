
public class moveZeroToEnd {
	public static  void moveZero(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i] == 0)
			{
				for(int j=i+1;j<n;j++){
					if(arr[j]!=0)
					{
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		
	}
	public static void display(int[] arr,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {2,3,0,0,0,0,9,8};
		moveZero(arr, arr.length);
		display(arr, arr.length);
		
	}
	

}
