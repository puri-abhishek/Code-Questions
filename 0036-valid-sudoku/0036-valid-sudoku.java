class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char num =  board[i][j];
                if(num != '.'){
                    String row = num + " in row " + i;
                    String column = num + " in column " + j;
                    String box = num + " in box " + i/3 + " - " + j/3;
                    if(!hs.add(row) || !hs.add(column) || !hs.add(box))
                        return false;
                }
            }
        }
        return true;
    }
}