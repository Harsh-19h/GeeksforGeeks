
class Solution {
    boolean isHeap(Node tree) {
        if(tree==null) return true;
    Queue<Node> q = new LinkedList<>();
    q.add(tree);
    boolean nullchild = false;
    while(q.size()!=0){
        Node temp = q.remove();
        
        if(temp.left!=null){
            if(nullchild) return false;
            if(temp.left.data>temp.data) return false;
            q.add(temp.left);
        }else nullchild = true;
        
        if(temp.right!=null){
            if(nullchild) return false;
            if(temp.right.data>temp.data) return false;
            q.add(temp.right);
        } else nullchild = true;
    }
    return true;
    }
}