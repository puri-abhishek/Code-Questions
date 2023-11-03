class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length())
            return false;
        
        Map<Character, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c) + 1);
            }
            else
                hm.put(c, 1);
        }
        
        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            if(hm.containsKey(c)){
                if(hm.get(c) == 1)
                    hm.remove(c);
                else
                    hm.put(c, hm.get(c) - 1);
            }
            else
                return false;
        }
        return true;
    }
}