// rules
// 1-9 once in row,column & grid(3*3)

public class Sudoku {
public boolean isSafe(char[][] board ,int row,int col,int number){
    //row & column
    for(int i=0;i<board.length;i++){
        if(board[i][col] == (char)(number + '0')){
            return false;
        }
        if(board[row][i] == (char)(number + '0')){
            return false;
        }
    }
    //grid

        // Check the 3x3 sub-grid
    int sr = (row/3) * 3; //Starting row of the sub-grid
    int sc = (col/3) * 3; // Starting column of the sub-grid

    for(int i= sr;i<sr+3;i++){
        for(int j=sc; j<sc+3;j++){
            if(board[i][j] == (char)(number + '0')){
                return false;
            }
        }
    }
    return true;
}

    public boolean helper(char[][] board,int row,int col){
        // If we've reached the end of the board, the sudoku is solved
        if(row == board.length){
            return true;
        }
         // Move to the next cell
        int newRow =0;
        int newCol =0;
        if(col != board.length-1){
            newRow = row;
            newCol = col +1;
        }else{
            newRow = row +1;
            newCol =0;
        }

        if(board[row][col] != '.'){
            return helper(board, newRow, newCol);
        }else{
            for(int i=1; i<=9;i++){
                if(isSafe(board,row,col,i)){
                    board[row][col] = (char)(i+'0');
                   if(helper(board, newRow, newCol)){
                    return true;
                   }
               
                    board[row][col] = '.';
                }
            }
        } 
        return false;
    }

    public void solveSudoku(char[][] board){
        helper(board, 0, 0);
    }
    public static void main(String[] args) {
        Sudoku sudokuSolver = new Sudoku();
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        sudokuSolver.solveSudoku(board);

        // Print the solved board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
