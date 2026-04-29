class Solution {
    int missingNum(int arr[]) {
        
        for(int i=0;i<arr.length;i++){
            
            if(Math.abs(arr[i]) > arr.length ) continue;
            
            int val = Math.abs(arr[i])-1;
             arr[val] = -arr[val];
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0) return i+1 ;
        }
        
        return arr.length+1;
    }
}