class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
      int arr[] = new int[a.length+b.length];
      for(int i=0;i<a.length;i++){
        arr[i]=a[i];
      }  
      for(int i=0;i<b.length;i++){
        arr[a.length+i] = b[i];
      }
      Arrays.sort(arr);
      ArrayList<Integer> ans = new ArrayList<>();
      ans.add(arr[0]);
      for(int i=1;i<arr.length;i++){
        if(arr[i]!= arr[i-1]){
            ans.add(arr[i]);
        }
      }
      return ans;
    }
}