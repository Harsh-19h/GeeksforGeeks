class Solution {
    public int[] shortestPath(int V, int[][] edges, int src) {
        int dist[] = new int[V];
        for(int i=0;i<dist.length;i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int a = edges[i][0];
            int b = edges[i][1];
            list.get(a).add(b);
            list.get(b).add(a);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int curr = q.remove();
            for(int val: list.get(curr)){
                if(dist[curr]!=Integer.MAX_VALUE && dist[curr]+1<dist[val]){
                    dist[val] = dist[curr]+1;
                    q.add(val);
                }
            }
        }
        for(int i=0;i<dist.length;i++){
            if(dist[i]==Integer.MAX_VALUE) dist[i]=-1;
        }
        return dist;
    }
}
