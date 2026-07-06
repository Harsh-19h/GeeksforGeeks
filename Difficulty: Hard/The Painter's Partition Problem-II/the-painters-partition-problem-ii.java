class Solution {
    
    public static int calculate(int arr[],int mid){
        
        int sum =0;
        int count =1;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>mid){
                count++;
                sum = arr[i];
            }
            else sum+=arr[i];
        }
        return count;
    }
    
    public int minTime(int[] arr, int k) {
        int s = Integer.MIN_VALUE;
        int e = 0;
        
        for(int i=0;i<arr.length;i++){
            s = Math.max(s,arr[i]);
            e += arr[i];
        }
        
        int ans = Integer.MAX_VALUE;
        while(s<=e){
            int mid = s+(e-s)/2;
            
            int count = calculate(arr,mid);
            
            if(count<=k){
                ans = Math.min(ans,mid);
                e = mid-1;
            }
            else s= mid+1;
        }
        return ans;
        
    }
}
