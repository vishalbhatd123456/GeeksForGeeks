 static long countNonRepeated(int arr[], int n)
    {
        HashMap<Integer, Integer> h = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            if(h.containsKey(arr[i]))
            {
                h.put(arr[i],h.get(arr[i])+1);
            }
            else{
                h.put(arr[i],1);
            }
        }
        long c=0;
        for(Map.Entry<Integer,Integer> e: h.entrySet())
        {
            if(e.getValue()==1)
            {
                c++;
            }
        }
        return c;
        
    }
