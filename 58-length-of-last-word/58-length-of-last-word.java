class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int n = str.length();
        int count = 0;
            for(int i=n-1;i>=0;i--){
                if(str.charAt(i)==' ') 
                break;
                count++;
                }
            return count;
        }
}