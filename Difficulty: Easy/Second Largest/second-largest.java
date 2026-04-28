class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int m1 = -1;
        int m2 = -1;
        for(int val: arr){
            if(val>m1){
                m2 = m1;
                m1 = val;
            }
            else if(val>m2 && val!=m1){
                m2 = val;
            }
            
        }
        return m2;
    }
}