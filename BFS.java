 static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj, int n) {
        // add your code here
        boolean vis[] = new boolean[n];
        int src = 0;
        
       // int src = 0;
        
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        vis[src] = true;
        q.add(src);
        
        while(q.size()!=0)
        {
            int u = q.poll();
            res.add(u);
            
            for(int v:adj.get(u))
            {
                if(vis[v] ==false)   
                {
                q.add(v);
                vis[v] = true;
                }
            }
        }
        return res;
        
    }
