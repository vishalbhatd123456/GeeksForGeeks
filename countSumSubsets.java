
public class countSubSetsRec {
	static int countSubsets(int arr[],int n,int sum)
	{
		if(n==0)
			return (sum==0)?1:0;
		
		return countSubsets(arr, n-1, sum)+countSubsets(arr, n-1, sum-arr[n-1]);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,1,3};
		int n=arr.length;
		System.out.println(countSubsets(arr, n,3));
	}

}
