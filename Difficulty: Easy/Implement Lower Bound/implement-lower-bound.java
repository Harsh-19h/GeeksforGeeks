class Solution {
    int lowerBound(int[] arr, int target) {
        
        Arrays.sort(arr);
        
        int l = 0;
        int r = arr.length-1;
        
        while(l<=r){
            int mid = l+(r-l)/2;
            
            if(arr[mid]>=target && l==r ){
                return mid;
            }
            
            if(arr[mid]>=target) r= mid;
            
            else  l=mid+1;
        }
        return arr.length; 
    }
}
