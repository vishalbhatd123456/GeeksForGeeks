//User function Template for Java

class Majority
{
    static int majorityElement(int arr[], int n)
    {
        // your code here
        int maxCount = 0;
        int index = -1;
        
        for(int i=0;i<n;i++)
        {
            int count = 0;
            
            for(int j=0;j<n;j++)
            {
                if(arr[i] == arr[j])
                count++;
            }
            
            if(count>maxCount)
            {
                maxCount = count;
                index = i;
            }
            
        }
        if(maxCount > n/2)
        return arr[index];
        
        else
        return -1;
        
    }
}
