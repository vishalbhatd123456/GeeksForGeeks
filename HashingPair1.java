 public static int sumExists(int arr[], int N, int sum)
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int i=0;i<N;i++)
        {
            if(hs.contains(sum-arr[i]))
            {
                return 1;
            }
            else
            {
                hs.add(arr[i]);
            }
        }
        return 0;
        
    }
