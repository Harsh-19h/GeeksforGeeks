class Solution {
    public static void dfs(int[][]ans, int[][]visited, int sr, int sc, int newColor,int oc){
        visited[sr][sc] = 1;
        if(sr>0 && ans[sr-1][sc] == oc && visited[sr-1][sc] != 1 ){
            ans[sr-1][sc] = newColor;
            visited[sr-1][sc] = 1;
            dfs(ans,visited,sr-1,sc,newColor,oc);
        }
         if(sr<ans.length-1 && ans[sr+1][sc] == oc && visited[sr+1][sc] != 1 ){
            ans[sr+1][sc] = newColor;
            visited[sr+1][sc] = 1;
            dfs(ans,visited,sr+1,sc,newColor,oc);
        }
        if(sc>0 && ans[sr][sc-1] == oc && visited[sr][sc-1]!=1){
            ans[sr][sc-1] = newColor;
            visited[sr][sc-1] = 1;
            dfs(ans,visited,sr,sc-1,newColor,oc);
        }
         if(sc<ans[0].length-1 && ans[sr][sc+1] == oc && visited[sr][sc+1]!=1){
            ans[sr][sc+1] = newColor;
            visited[sr][sc+1] = 1;
            dfs(ans,visited,sr,sc+1,newColor,oc);
        }
        ans[sr][sc] = newColor;
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int ans[][] = new int[image.length][image[0].length];
        int visited[][] = new int [image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                ans[i][j] =image[i][j];
            }
        }
        int oc = image[sr][sc];
        dfs(ans,visited,sr,sc,newColor,oc);
        return ans;
    }
}