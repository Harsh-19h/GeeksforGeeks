class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        for(int val : arr){
            max = Math.max(val,max);
        }
        return max;
    }
}
