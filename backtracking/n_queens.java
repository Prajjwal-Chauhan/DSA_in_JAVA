import java.util.Scanner;

public class n_queens {

    public static boolean isSafe(boolean[][] board,int row,int col){

        for(int i = 0 ; i < board.length ; i++){
            if(board[i][col]) return false;
        }

        for(int i = 0 ; i < board[0].length ; i++){
            if(board[row][i]) return false;
        }

        for(int i = 0 ; i < board.length ; i++){
            if(board[i][col]) return false;
        }

        int r = row;
        for(int c = col ; c >=0 && r>=0  ; c-- , r--){
            if(board[r][c]){
                return false;
            }
        }

        r = row;
        for(int c = col ; c < board.length && r>=0  ; c++ , r--){
            if(board[r][c]){
                return false;
            }
        }

        r = row;
        for(int c = col ; c >= 0 && r<board[0].length  ; c-- , r++){
            if(board[r][c]){
                return false;
            }
        }

        r = row;
        for(int c = col ; c < board.length && r<board[0].length  ; c++ , r++){
            if(board[r][c]){
                return false;
            }
        }

        return true;
    }

    public static int countWays(boolean[][] board,int currentRow){
        int count = 0;
        if(currentRow == board.length) return 1;


        for(int col = 0 ; col < board[currentRow].length ; col++){

            if(isSafe(board, currentRow, col)){
                board[currentRow][col] = true;
                
                int result = countWays(board,currentRow+1);
                count += result;
                board[currentRow][col] = false;
            }
        }

        return count;
    }
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 6;
        boolean[][] chessboard = new boolean[n][n];
        System.out.println(countWays(chessboard, 0));
        sc.close();
    }
}