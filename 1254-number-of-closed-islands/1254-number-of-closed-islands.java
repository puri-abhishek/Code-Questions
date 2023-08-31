class Solution {
    public int closedIsland(int[][] grid) {
        if(grid.length < 3 || grid[0].length < 3)
            return 0;
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0){
                    if(check(i, j, grid)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public boolean check(int row, int col, int[][] grid){
        if(grid[row][col] == 1 || grid[row][col] == 2)
            return true;
        
        if(row == 0 || row == grid.length - 1 || col == 0 || col == grid[row].length - 1)
            return false;
        
        grid[row][col] = 2;
        
        boolean left = check(row, col - 1, grid);
        boolean right = check(row, col + 1, grid);
        boolean up = check(row - 1, col, grid);
        boolean down = check(row + 1, col, grid);
        
        return left && right && up && down;
    }
}