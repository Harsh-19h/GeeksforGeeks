class Solution {
    public int nthRoot(int n, int m) {
        // code here
        for(int i=0;Math.pow(i,n)<=m;i++){
            if(Math.pow(i,n)==m) return i;
        }
        return -1;
    }
}