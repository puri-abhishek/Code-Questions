class Solution {
    public int strStr(String haystack, String needle) 
    {
        int ans=-1;
        if(haystack.contains(needle))
        {
            int index=haystack.indexOf(needle);
            ans=index;
        }
        return ans;
    }
}