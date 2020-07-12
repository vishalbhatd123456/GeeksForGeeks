class Majority
{
    static int majorityElement(int arr[], int n)
    {
        
        
        Arrays.sort(arr);
        
        //the majority element is supposed to be in the middle always
        
        int low = 0;
        int high = arr.length-1;
        int mid = (low+high)/2;
        int count = 1;
        for(int i=mid+1;i<arr.length;i++)
        {
            //nlogn time complexity
            if(arr[i] == arr[mid])
            {
                count++;
            }
        }
        
        for(int i=0;i<mid;i++)
        {
            if(arr[i] == arr[mid])
            {
                count++;
            }
        }
        
        if(count>(arr.length)/2)
        {
            return arr[mid];
        }
        else
        {
            return -1;
        }
        
    }
}
