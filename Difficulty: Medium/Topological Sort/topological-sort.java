class Solution {
    ArrayList<Integer> ans = new ArrayList<>();
    public void dfs(boolean visited[], List<List<Integer>> list,int i){
        visited[i] = true;
        for(int j=0;j<list.get(i).size();j++){
            int curr = list.get(i).get(j);
            if(!visited[curr]){
                dfs(visited,list,curr);
            }
        }
        ans.add(i);
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
        boolean visited[]  = new boolean[list.size()];
        for(int i=0;i<list.size();i++){
            if(visited[i] == false){
                dfs(visited,list,i);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}