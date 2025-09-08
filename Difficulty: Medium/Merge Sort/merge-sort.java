class Solution {
    void merge(int arr[], int l, int mid, int r){
        int i = l;
        int j = mid + 1;
        int k = 0;
        int ans[] = new int[r - l + 1];

        while(i <= mid && j <= r){
            if(arr[i] < arr[j]){
                ans[k++] = arr[i++];
            } else {
                ans[k++] = arr[j++];
            }
        }
        while(i <= mid){
            ans[k++] = arr[i++];
        }
        while(j <= r){
            ans[k++] = arr[j++];
        }
        for(int a = 0; a < ans.length; a++){
            arr[l + a] = ans[a];
        }
    }
    void mergeSort(int arr[], int l, int r) {
        if(l >= r) return;
        int mid = l + (r - l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }
}
