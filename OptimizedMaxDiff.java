
public class OptMaxDiff {
	public static int maxDiff(int arr[],int n)
	{
		int res = arr[1]-arr[0];
		int minVal = arr[0];;
		
		for(int j=2;j<n;j++)
		{
			res = Math.max(res, arr[j]-minVal);
			minVal = Math.min(minVal, arr[j]);
		}
		return res;
	}
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		int n = arr.length;
		
		int res = maxDiff(arr, n);
		System.out.println(res);
	}

}
