/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
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

    static ArrayList<Integer> topView(Node root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<pair> q = new LinkedList<>();
        int minLevel = Integer.MAX_VALUE;
        int maxLevel = Integer.MIN_VALUE;
        q.add(new pair(root,0));
        
        while(q.size()!=0){
            pair temp = q.remove();
            Node n = temp.node;
            int level = temp.level;
            if(level<=minLevel) minLevel = level;
            if(level>=maxLevel) maxLevel = level;
            if(!map.containsKey(level)){
                map.put(level,n.data);
            }
            if(n.left!=null) q.add(new pair(n.left,level-1));
            if(n.right!=null) q.add(new pair(n.right,level+1));
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=minLevel;i<=maxLevel;i++){
           ans.add(map.get(i)); 
        }
        return ans;
    }
}