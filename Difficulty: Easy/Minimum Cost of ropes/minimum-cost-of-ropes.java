class Solution {
    public static int minCost(int[] arr) {
        if(arr.length<2) return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int sum = 0;
        while(pq.size()>0){
            int a = pq.remove();
            int b = pq.remove();
            int total = a+b;
            sum+=total;
            if(pq.size()!=0) pq.add(total);
        }
         return sum;
        
    }
}