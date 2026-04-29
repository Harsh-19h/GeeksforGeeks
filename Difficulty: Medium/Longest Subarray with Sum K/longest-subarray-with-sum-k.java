// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum =0;
        int max =0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(!map.containsKey(sum)) map.put(sum,i);
            
            if(sum==k){
                max = Math.max(max,i+1);
            }
            
            int diff = sum-k;
            if(map.containsKey(diff)){
                int idx = map.get(diff);
                max = Math.max(max,i-idx);
            }
        }
        return max;
    }
}
