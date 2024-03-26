class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char c1[] = text1.toCharArray();
        char c2[] = text2.toCharArray();
        return DP(c1, c2);
    }
    
    public static int DP(char c1[], char c2[]){
        int dp[][] = new int[c1.length + 1][c2.length + 1];
        for(int i = 1; i <= c1.length; i++){
            for(int j = 1; j <= c2.length; j++){
                int ans = 0;
                if(c1[i - 1] == c2[j - 1])
                    ans = 1 + dp[i - 1][j - 1];
                else
                    ans = Math.max(dp[i - 1][j], dp[i][j - 1]);
                dp[i][j] = ans;
            }
        }
        return dp[c1.length][c2.length];
    }
}