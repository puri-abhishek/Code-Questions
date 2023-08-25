class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0, maxArea = 0;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                if(grid[i][j] == 1)
                {
                    area = BFS(grid, i, j);
                    maxArea = Math.max(area, maxArea);
                }
            }
        }
        return maxArea;
    }
     public int BFS(int[][] grid, int i, int j)
    {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0)
            return 0;
        else
        {
            grid[i][j] = 0;
            return 1 + BFS(grid, i + 1, j) + BFS(grid, i - 1, j) + BFS(grid, i, j + 1) + BFS(grid, i, j - 1);
        }
    }
}