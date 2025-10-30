class Solution {
    class pair{
        int val;
        int parent;
        pair(int val,int parent){
            this.val = val;
            this.parent = parent;
        }
    }
    public boolean bfs(boolean visited[], int i, List<List<Integer>> list){
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(i,-1));
        visited[i] = true;
        while(!q.isEmpty()){
            pair curr = q.poll();
            visited[curr.val] = true;
            for(int j=0;j<list.get(curr.val).size();j++){
                int c = list.get(curr.val).get(j);
                if(visited[c]==false) {
                    q.add(new pair(c,curr.val));
                    visited[c] = true;
                }
                else if(c!=curr.parent) return true;
            }
        }
        return false;
    }
    
    public boolean isCycle(int V, int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int a = edges[i][0] ; int b =edges[i][1]; 
            list.get(a).add(b);
            list.get(b).add(a);
        }
        boolean visited[] = new boolean [V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(bfs(visited,i,list)) return true;
            }
        }
        return false;
    }
}