/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Solution {
    public static int levels(Node root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    
    public static void preorder(Node root, int level, List<Integer> list){
        if(root==null) return;
        list.set(level,root.data);
        preorder(root.right, level+1,list);
        preorder(root.left,level+1,list);
   
    }
    ArrayList<Integer> leftView(Node root) {
        int n = levels(root);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(0);
        }
        preorder(root,0,list);
        return list;
    }
}