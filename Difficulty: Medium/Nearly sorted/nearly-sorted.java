class Solution {
    public void nearlySorted(int[] arr, int k) {
        int idx =0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                arr[idx] = pq.remove();
                idx++;
            }
        }
        for(int i=0;i<k;i++){
            arr[idx] = pq.remove();
            idx++;
        }
    }
}
