class Solution {
    ArrayList<Integer> ans = new ArrayList<>();
    public void bfs(int incoming[] ,boolean visited[],List<List<Integer>> list, int i){
        visited[i] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int top = q.remove();
            ans.add(top);
            for(int j=0;j<list.get(top).size();j++){
                int curr = list.get(top).get(j);
                incoming[curr]--;
                if(incoming[curr]==0) {
                    q.add(curr);
                    visited[curr] =true;
                }
            }
        }
    }
     public ArrayList<Integer> topoSort(int V, int[][] edges) {
         List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int a = edges[i][0]; int b = edges[i][1];
            list.get(a).add(b);
        }
        boolean visited[]  = new boolean[V];
        
        int incoming[] = new int[V];
        for(int i=0;i<edges.length;i++){
             int x = edges[i][1];
            incoming[x]++;
        }
        
        for(int i=0;i<V;i++){
            if(visited[i] == false && incoming[i]==0){
                bfs(incoming,visited,list,i);
            }
        }
        return ans;
    }
}