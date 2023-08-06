class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length  == 0)
            return -1;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 2)
                    rot(grid, i, j, 2);
            }
        }
        
        int minutes = 2;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 1)
                    return -1;
                minutes = Math.max(minutes, grid[i][j]);
            }
        }
        return minutes - 2;
    }
    
    public void rot(int[][] grid, int i, int j, int minutes)
    {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || grid[i][j] > 1 && grid[i][j] < minutes)
            return;
        else
        {
            grid[i][j] = minutes;
            rot(grid, i + 1, j, minutes + 1);
            rot(grid, i - 1, j, minutes + 1);
            rot(grid, i, j + 1, minutes + 1);
            rot(grid, i, j - 1, minutes + 1);
        }
    }
}