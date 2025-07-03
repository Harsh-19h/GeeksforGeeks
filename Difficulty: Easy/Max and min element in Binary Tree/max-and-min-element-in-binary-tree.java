
class Solution {
    static int max=Integer.MIN_VALUE;
    static int min=Integer.MAX_VALUE;
    public static int levels(Node root){
        if(root==null) return 0;
        if(root.data>max) max = root.data;
        if(root.data<min) min = root.data;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public static int findMax(Node root) {
       max = Integer.MIN_VALUE;
       levels(root);
       return max;
        
    }

    public static int findMin(Node root) {
        min=Integer.MAX_VALUE;
        levels(root);
        return min;
    }
}