class Solution {
    int upperBound(int[] arr, int target) {
        int l= 0;
        int r = arr.length-1;
        int ans = arr.length;
        
        Arrays.sort(arr);
        
        while(l<=r){
            int mid = l+(r-l)/2;
            
            if(arr[mid]>target){
                ans = mid;
                r = mid-1;
            }
            else l = mid+1;
        }
         return ans;
    }
}
