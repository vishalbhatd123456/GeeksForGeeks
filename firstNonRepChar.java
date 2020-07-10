char nonrepeatingCharacter(String S)
     {
          int n = S.length();
        int[] count = new int[256];
        Arrays.fill(count, -1);
        
        for(int i=0;i<n;i++) {
            count[S.charAt(i)]++;
        }
        
        for(int i=0;i<n;i++) {
            if(count[S.charAt(i)]==0)
                return S.charAt(i);
        }
        return '$';
     }
