class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> arr = new ArrayList();
        if(digits.length() == 0 || digits == null)
            return arr;
        
        String[] map = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        recur(arr, digits, "", 0, map);
            return arr;
    }
    public void recur(List<String> arr, String digits, String curr, int index, String[] map){
        if(index == digits.length()){
            arr.add(curr);
            return;
        }
        
        String letters = map[digits.charAt(index) - '0'];
        for(int i = 0; i < letters.length(); i++){
            recur(arr, digits, curr + letters.charAt(i), index + 1, map);
        }
    }
}