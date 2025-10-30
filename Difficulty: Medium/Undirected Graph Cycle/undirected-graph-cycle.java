class Solution {
    public boolean dfs(boolean visited[], int i, int parent, List<List<Integer>> list){
        visited[i] = true;
        for(int j=0;j<list.get(i).size();j++){
            int c = list.get(i).get(j);
            if(visited[c]==false) {
                if(dfs(visited,c,i,list)) return true;
            }
            else if(c!=parent) return true;
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
                if(dfs(visited,i,-1,list)) return true;
            }
        }
        return false;
    }
}