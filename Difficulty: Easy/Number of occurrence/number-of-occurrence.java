class Solution {
    
    public int lower(int arr[],int target){
        
        int l = 0;
        int r= arr.length-1;
        int ans = -1;
        
        while(l<=r){
            int mid = l+(r-l)/2;
            
            if(arr[mid]==target){
                ans = mid;
                r = mid-1;
            }
            else if(arr[mid]<target) l= mid+1;
            else r = mid-1;
        }
        return ans;
    }
    
    public static int upper(int arr[], int target){
        int l=0;
        int r= arr.length-1;
        int ans = -1;
        
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==target){
                ans = mid;
                l = mid+1;
            }
            else if(arr[mid]<target) l = mid+1;
            else r = mid-1;
        }
        return ans;
    }
    
    int countFreq(int[] arr, int target) {
        
        int s = lower(arr,target);
        int e = upper(arr,target);
        
        if(s==-1 || e==-1) return 0;
        else return (e-s) +1;
        
    }
}
