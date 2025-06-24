// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        int count =0;
        int num =n;
        while(n>0){
            int digit = n%10;
             
            if(digit!=0 && num%digit==0){
                count++;
            }
            n = n/10;
        }
        return count;
    }
}