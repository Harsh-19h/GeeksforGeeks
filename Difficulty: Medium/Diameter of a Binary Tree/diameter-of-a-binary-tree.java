
class Solution {
    static int max = 0;
    public static int levels(Node root){
        if (root==null) return 0;
        int leftLevel = levels(root.left);
        int rightLevel=levels(root.right);
        int dia = leftLevel+rightLevel;
        if(dia>max){
            max= dia;
        }
        return 1+Math.max(leftLevel,rightLevel);
    }
    int diameter(Node root) {
        max=0;
        levels(root);
        return max;
    }
}