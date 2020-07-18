// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Trap obj = new Trap();
		    
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}

// } Driver Code Ends


class Trap{
    
    // function to find the trapped water in between buildings
    // arr: input array
    // n: size of array
    static int trappingWater(int arr[], int n) { 
        
        // Your code here
        int res = 0;
        for(int i=0;i<n-1;i++)
        {
            int lMax = arr[i];
            for(int j=0;j<i;j++)
            {
                lMax = Math.max(lMax,arr[j]);
            }
            int rMax = arr[i];
            
            for(int j=i+1;j<n;j++)
            {
                rMax = Math.max(rMax,arr[j]);
            }
            res = res+(Math.min(rMax,lMax)-arr[i]);
        }
        return res;
        
    } 
}

