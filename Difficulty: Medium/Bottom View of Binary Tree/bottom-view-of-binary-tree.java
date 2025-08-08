/*
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references

    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}
*/
class pair{
    Node node;
    int level;
    pair(Node node,int level){
        this.level = level;
        this.node = node;
    }
}

class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root,0));
        int minlevel= Integer.MAX_VALUE;
        int maxlevel = Integer.MIN_VALUE;
        while(!q.isEmpty()){
            pair temp = q.remove();
            Node n =temp.node;
            int level = temp.level;
            minlevel = Math.min(minlevel,level);
            maxlevel = Math.max(maxlevel,level);
            map.put(level,n.data);
            if(n.left!=null) q.add(new pair(n.left,level-1));
            if(n.right!=null) q.add(new pair(n.right,level+1));
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=minlevel;i<=maxlevel;i++){
            ans.add(map.get(i));
        }
        return ans;
        
    }
}