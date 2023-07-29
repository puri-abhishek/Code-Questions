class Solution {
    boolean visited[][];
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
         visited= new boolean[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(board[i][j] == word.charAt(0) && dfs(board, word, 0, i, j))
                    return true;
            }
        }
        return false;
    }
    
    public boolean dfs(char[][] board, String word, int index, int i, int j)
    {
        if(index == word.length())
            return true;
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index) || visited[i][j])
            return false;
        
        visited[i][j] = true;
        boolean found = dfs(board, word, index +  1, i + 1, j) || dfs(board, word, index +  1, i - 1, j) || dfs(board, word, index +  1, i, j + 1) || dfs(board, word, index +  1, i, j - 1);
        visited[i][j]  = false;
        return found;
    }
}