
class Solution {
    public static void inorder(Node root,ArrayList<Integer> arr){
        if(root==null) return ;
         inorder(root.left,arr);
         arr.add(root.data);
        inorder(root.right,arr);
        
       
    }
    static int count = 0;
    public static void postorder(Node root,ArrayList<Integer> arr){
        if(root==null) return;
        postorder(root.left,arr);
        postorder(root.right,arr);
        root.data=arr.get(count++);
    }
    public static void convertToMaxHeapUtil(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        count=0;
        postorder(root,arr);
    }
}