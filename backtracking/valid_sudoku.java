class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> hash = new HashSet<>();
        for(int row = 0 ; row < 9 ; row++){
            for(int col = 0 ; col < 9 ; col++){
                char val = board[row][col];
                if(val!='.'){
                    if(!hash.add(val + " in row "+row) || !hash.add(val + " in col " + col) || !hash.add(val+" in box " + (row/3) + " , " + (col/3))){
                        return false;
                    }
                }
            }
            
        }
        return true;
    }
}
