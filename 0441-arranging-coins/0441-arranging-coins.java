/*
class Solution {
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
}
*/

/*
class Solution {
    public int arrangeCoins(int n) {
        int i;
        for(i = 1; i <= n; i++)
            n = n - i;
        return i - 1;
    }
}
*/

class Solution {
    public int arrangeCoins(int n) {
        long n_d = (long) n;
        long l = 1, r = n_d;
        
        while(l <= r){
            long mid = l + (r - l) / 2;
            if(mid * (mid + 1) / 2 <= n_d  )
                l = mid + 1;
            else
                r = mid - 1;
        }
        return (int) l - 1 ;
    }
}