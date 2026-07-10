class Solution {
    
    public static int count(int arr[]){
        
        int s = 0;
        int e = arr.length-1;
        
        int idx = arr.length;
        
        while(s<=e){
            int mid = s+(e-s)/2;
            
            if(arr[mid]==1){
                idx = mid;
                e = mid-1;
            }
            
            else s = mid+1;
        }
        
        return arr.length - idx;
    }
    
    public int rowWithMax1s(int[][] arr) {
        
        int ans = -1;
        int max = 0;
        
        for(int i=0;i<arr.length;i++){
            
            int ones = count(arr[i]);
            
            if(ones>max){
                max = ones;
                ans = i;
            }
        }
        
        return ans;
    }
}