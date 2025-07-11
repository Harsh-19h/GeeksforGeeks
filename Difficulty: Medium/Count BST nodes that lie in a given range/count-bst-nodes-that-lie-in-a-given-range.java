
class Solution {
    int getCount(Node root, int l, int h) {
       if(root==null) return 0; 
       if(root.data<l){
          return getCount(root.right,l,h);
       }
       if(root.data>h){
          return getCount(root.left,l,h);
       }
       return 1+ getCount(root.right,l,h)+ getCount(root.left,l,h);
    }
}