
class Solution {
    public static void insertatbottom(Stack<Integer>St, int top){
        if(St.size()==0){
            St.push(top);
            return;
        } else{
            int x = St.pop();
            insertatbottom(St,top);
            St.push(x);
        }
    }
    static void reverse(Stack<Integer> St) {
        if(St.size()==1) return;
        int top = St.pop();
        reverse(St);
        insertatbottom(St,top);
    }
}