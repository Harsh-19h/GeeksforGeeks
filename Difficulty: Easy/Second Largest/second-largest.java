class Solution {
    public int getSecondLargest(int[] arr) {
        int max = arr[0];
        int max2 = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max && arr[i]>max2){
            max2 = max;
            max=arr[i];
            }
            if(arr[i]<max && arr[i]>max2)
            max2= arr[i];
        }
        return max2;
    }
}