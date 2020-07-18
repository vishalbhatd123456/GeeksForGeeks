import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static int maxDiff(int arr[],int n)
     {
         int res = arr[1]-arr[0];
         for(int i=0;i<n-1;i++)
         {
             for(int j=i+1;j<n;j++)
             {
                 res = Math.max(res,arr[j]-arr[i]);
             }
         }
         return res;
     }
	public static void main (String[] args)
	 {
	 //code
	 Scanner scan = new Scanner(System.in);
	 int t = scan.nextInt();
	 
	 while(t-- >0)
	 {
	     int n = scan.nextInt();
	     int arr[] = new int[n];
	     for(int i=0;i<n;i++)
	     {
	         arr[i] = scan.nextInt();
	     }
	     int res = maxDiff(arr,n);
	     System.out.println(res);
	 }
	 }
}
