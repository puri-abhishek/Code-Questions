class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> arr = new ArrayList<>();
        LetterCase(arr, s, "", s.length(), 0);
        return arr;
    }
    public void LetterCase(List<String> arr, String s, String p, int len, int i){
        if(i == len)
        {
            arr.add(new String (p));
            return;
        }
        char ch = s.charAt(i);
        if(Character.isLetter(ch))
        {
            if(Character.isUpperCase(ch))
              LetterCase(arr, s, p + Character.toLowerCase(ch), len, i + 1);
            else
              LetterCase(arr, s, p + Character.toUpperCase(ch), len, i + 1);  
        }
        LetterCase(arr, s, p + ch, len, i + 1);
    }
}