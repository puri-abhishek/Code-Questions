class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> arr = new ArrayList();
        recursi(arr, "", 0, 0, n);
        return arr;
    }
    
    public void recursi(List<String> arr, String str, int open, int close, int n) {
        if(str.length() == n * 2) {
            arr.add(str);
            return;
        }
        if(open < n)
            recursi(arr, str + "(", open + 1, close, n);
        if(close < open)
            recursi(arr, str + ")", open, close + 1, n);
    }
}