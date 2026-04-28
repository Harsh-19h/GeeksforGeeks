// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int n = arr.length;
        for(int i= n-1;i>0;i--){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
        return ;
    }
}