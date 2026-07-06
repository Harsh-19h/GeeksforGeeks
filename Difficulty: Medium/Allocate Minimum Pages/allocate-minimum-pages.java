class Solution {

    public static int calculate(int arr[], long mid) {

        long sum = 0;
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] > mid) {
                count++;
                sum = arr[i];
            } else {
                sum += arr[i];
            }
        }
        return count;
    }

    public int findPages(int[] arr, int k) {

        if (k > arr.length)
            return -1;

        long s = Integer.MIN_VALUE;
        long e = 0;

        for (int i = 0; i < arr.length; i++) {
            s = Math.max(s, arr[i]);
            e += arr[i];
        }

        long ans = Long.MAX_VALUE;

        while (s <= e) {

            long mid = s + (e - s) / 2;

            int count = calculate(arr, mid);

            if (count <= k) {
                ans = Math.min(ans, mid);
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return (int) ans;
    }
}