/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        // code here
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.data-b.data);
        
        Node temp = root;
        while(temp!=null){
            pq.add(temp);
            Node b = temp.bottom;
            while(b!=null){
                pq.add(b);
                b = b.bottom;
            }
            temp = temp.next;
        }
        
        Node dummy = new Node(0);
        Node curr = dummy;
        while(!pq.isEmpty()){
            curr.bottom = pq.remove();
            curr= curr.bottom;
        }
        
        return dummy.bottom;
    }
}