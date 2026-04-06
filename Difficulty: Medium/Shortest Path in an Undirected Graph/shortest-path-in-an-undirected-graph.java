class Solution {
    
    class pair{
        int w;
        int dest;
        pair(int w, int dest){
            this.w = w;
            this.dest = dest;
        }
    }
    class pr{
        int d;
        int wt;
         pr(int d, int wt){
             this.d =d;
             this.wt =wt;
         }
    }
    
    public List<Integer> shortestPath(int n, int m, int edges[][]) {
        List<List<pr>> list = new ArrayList<>();
        for(int i=0;i<n;i++) list.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int a = edges[i][0]-1;
            int b = edges[i][1]-1;
            int c = edges[i][2];
            list.get(a).add(new pr(b,c));
            list.get(b).add(new pr(a,c));
        }
        
       int ans[] = new int[n];
       int parent[] = new int[n];
       Arrays.fill(parent,-1);
       
       ans[0] = 0;
       parent[0] = 0;
       
       for(int i=1;i<n;i++){
           ans[i] = Integer.MAX_VALUE;
           parent[i]= i;
       }
       
       PriorityQueue<pair> pq = new PriorityQueue<>((x,y)-> x.w-y.w);
       pq.add(new pair(0,0));
       
       while(!pq.isEmpty()){
           pair curr = pq.remove();
           int w = curr.w;
           int dest = curr.dest;
           if(w > ans[dest]) continue;
           for(pr p: list.get(dest)){
               if(w+p.wt<ans[p.d]){
                   ans[p.d] = w + p.wt;
                   pq.add(new pair(w+p.wt,p.d));
                   parent[p.d] = dest;
               }
           }
       }
       
       List<Integer> res = new ArrayList<>();
       if(ans[n-1]==Integer.MAX_VALUE){
           res.add(-1);
           return res;
       }else{
           res.add(ans[n-1]);
       }
       int node = n-1;
       while(parent[node]!=node){
           res.add(node);
           node = parent[node];
       }
       res.add(0);
       Collections.reverse(res.subList(1,res.size()));
       for(int i=1;i<res.size();i++){
        res.set(i, res.get(i) + 1);
        }
       return res;
      
       
    }
}