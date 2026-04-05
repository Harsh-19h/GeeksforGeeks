// User function Template for Java
class Solution {
    class pair{
        int dest;
        int cost;
        pair(int dest, int cost){
            this.dest = dest;
            this.cost = cost;
        }
    }
    
    public void topo(int vis[],List<List<pair>> list,Stack<Integer> st,int start){
        vis[start] = 1;
        for(pair curr: list.get(start)){
            int d = curr.dest;
            if(vis[d]==0){
                topo(vis,list,st,d);
            }
        }
        st.push(start);
    }

    public int[] shortestPath(int V, int E, int[][] edges) {
        // Code here
        List<List<pair>> list = new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int a = edges[i][0];
            int b=edges[i][1];
            int c = edges[i][2];
            list.get(a).add(new pair(b,c));
        }
        int vis[] = new int[V];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                topo(vis,list,st,i);
            }
        }
        int dist[] = new int[V];
        dist[0] = 0;
        for(int i=1;i<V;i++){
            dist[i] = Integer.MAX_VALUE;
        }
        while(!st.isEmpty()){
            int curr = st.pop();
            for(pair c: list.get(curr)){
                if(dist[curr] != Integer.MAX_VALUE && dist[curr]+c.cost<dist[c.dest]){
                    dist[c.dest] = dist[curr]+c.cost;
                }
            }
        }
        for(int i=0;i<V;i++){
            if(dist[i] == Integer.MAX_VALUE){
                dist[i] = -1;
            }
        }
        return dist;
        
    }
}