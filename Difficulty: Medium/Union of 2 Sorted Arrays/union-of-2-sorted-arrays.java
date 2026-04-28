class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int i= 0; int j = 0;
        int prev = 0;
        
        while(i<a.length && j<b.length){
            if(a[i]< b[j]){
                if(list.isEmpty()){
                    list.add(a[i]);
                    prev = 0;
                }
                else if( list.get(prev)!= a[i]){
                    list.add(a[i]);
                    prev=list.size()-1;
                }
                i++;
                
            }
            else{
                if(list.isEmpty()){
                    list.add(b[j]);
                    prev = 0;
                }
                else if(list.get(prev)!= b[j]){
                    list.add(b[j]);
                    prev = list.size()-1;
                }
                j++;
            }
        }
        while(i<a.length){
            if(a[i]!=list.get(prev)){
                list.add(a[i]);
                prev = list.size()-1;
            }
            i++;
        }
        while(j<b.length){
            if(b[j]!=list.get(prev)){
                list.add(b[j]);
                prev = list.size()-1;
            }
            j++;
        }
        
        return list;
    }
}
