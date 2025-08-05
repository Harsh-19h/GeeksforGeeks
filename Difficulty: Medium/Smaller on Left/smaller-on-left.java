class Solution {
    public int[] leftSmaller(int[] arr) {
        int ans[] = new int[arr.length];
        Stack<Integer> st = new Stack <>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
