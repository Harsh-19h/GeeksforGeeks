// User function Template for Java

class Solution {

    class pair{
        List<String> l ;
        int lvl;
        pair(List<String> l, int lvl){
            this.l = l;
            this.lvl = lvl;
        }
    }

    public ArrayList<ArrayList<String>> findSequences(String beginWord,
                                                      String endWord,
                                                      String[] wordList) {

        ArrayList<ArrayList<String>> ans = new ArrayList<>();

        HashSet<String> set = new HashSet<>();
        for(int i=0;i<wordList.length;i++){
            set.add(wordList[i]);
        }

        Queue<pair> q = new LinkedList<>();
        List<String> list = new ArrayList<>();
        list.add(beginWord);
        q.add(new pair(list,1));

        Set<String> usedOnLevel = new HashSet<>();
        int level = 1;

        boolean found = false;

        while(!q.isEmpty()){
            pair curr = q.remove();

            if(found && curr.lvl > level) break;

            if (curr.lvl > level) {
                level = curr.lvl;
                for (String s : usedOnLevel) {
                    set.remove(s);
                }
                usedOnLevel.clear();
            }

            String last = curr.l.get(curr.l.size()-1);

            if(last.equals(endWord)){
                found = true;

                if(ans.size()==0){
                    ans.add(new ArrayList<>(curr.l));
                }else if(ans.get(0).size() == curr.l.size()){
                    ans.add(new ArrayList<>(curr.l));
                }
                continue;
            }

            for(int i=0;i<last.length();i++){
                char[] replace = last.toCharArray();

                for(char j='a';j<='z';j++){
                    replace[i] = j;
                    String str = new String(replace);

                    if(set.contains(str)){
                        curr.l.add(str);
                        q.add(new pair(new ArrayList<>(curr.l), curr.lvl+1));
                        usedOnLevel.add(str);
                        curr.l.remove(curr.l.size()-1);
                    }
                }
            }
        }

        return ans;
    }
}