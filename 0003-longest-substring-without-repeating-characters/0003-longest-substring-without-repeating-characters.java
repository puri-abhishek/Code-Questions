class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, maxLength = 0;
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
                maxLength = Math.max(maxLength, i - left + 1);
            }
            else{
                while(hs.contains(s.charAt(i))){
                    hs.remove(s.charAt(left));
                    left++;
                }
                hs.add(s.charAt(i));
            }
                
        }
        return maxLength;
    }
}