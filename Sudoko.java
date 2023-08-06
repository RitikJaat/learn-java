public class Sudoko {
    public boolean isSafe(char[][] board, int row, int col, int num) {
        // row and col condition
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (num + '0')) {
                return false;
            }
            if (board[row][i] == (char) (num + '0')) {
                return false;
            }
        }
        // for grid
        int sc = (col / 3) * 3;
        int sr = (row / 3) * 3;

        for(int i = sr;i<sr+3;i++){
            for(int j= sc; j<sc+3;j++){
                if(board[i][j]==(char)(num + '0')){
                    return false;
                }
            }
        }
        return true;
    };

    public boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }

        int nRow = 0;
        int nCol = 0;
        if (col != board.length - 1) {
            nRow = row;
            nCol = col + 1;
        } else {
            nRow = row + 1;
            nCol = 0;
        }

        if (board[row][col] != '.') {
            if (helper(board, nRow, nCol)) {
                return true;
            } else {
                for (int i = 1; i <= 9; i++) {
                    if (isSafe(board, row, col, i)) {
                        board[row][col] = (char) (i + '0');
                        if (helper(board, nRow, nCol)) {
                            return true;
                        } else {
                            board[row][col] = '.';
                        }
                    }
                }
            }

        }
        return false;
    };

    public void solveSudoko(char[][] board) {
        helper(board, 0, 0);
    };

    public static void main(String[] args) {

    }
}
