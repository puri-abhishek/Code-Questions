/*class Solution {
    public int arrangeCoins(int n) {
      int ans = 0, i = 1;
        while(n>0){
            n = n - i;
            if(n >= 0)
                ans++;
            i++;
        }
        return ans;
    }
}*/

class Solution {
    public int arrangeCoins(int n) {
        int i;
        for(i = 1; i <= n; i++)
            n = n - i;
        return i - 1;
    }
}