class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;

        int count[] = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int freq : count){
            if(freq!=0)
                return false;
        }
        return true;
        /*
        if(s.length()!=t.length())
            return false;
        
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c) + 1);
            }
            else{
                hm.put(c, 1);
            }
        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(hm.containsKey(c)){
                if(hm.get(c) == 1){
                    hm.remove(c);
                }
                else{
                    hm.put(c, hm.get(c) - 1);
                }
            }
            else{
                return false;
            }
        }
        return true;*/
    }
}