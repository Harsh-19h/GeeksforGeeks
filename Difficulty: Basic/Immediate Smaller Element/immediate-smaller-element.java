// User function Template for Java

class Solution {
    public void immediateSmaller(int arr[]) {
        int n = arr.length;
        int ans[] = new int[arr.length];
        Stack <Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&& st.peek()>=arr[i] ){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = st.pop();
            }
            st.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
    }
}