class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> hs = new HashSet<>(wordList);
        if(!hs.contains(endWord))
            return 0;
        
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        
        int change = 1;
        
        while(!queue.isEmpty()){
            int size = queue.size();//something wrong with leetcode's compiler coz this code works when i add this line.
            for(int i = 0; i < size; i++){
                String word = queue.poll();
                if(word.equals(endWord))
                    return change;
                
                for(int j = 0; j < word.length(); j++){
                    for(char k = 'a'; k <= 'z'; k++){
                        char arr[] = word.toCharArray();
                        arr[j] = k;
                        
                        String str = new String(arr);
                        if(hs.contains(str) && !visited.contains(str)){
                            queue.add(str);
                            visited.add(str);
                        }
                    }
                }
            }
            ++change;
        }
        return 0;
    }
}