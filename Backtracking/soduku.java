class Solution {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = false;

        // find an empty cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = true;
                    break;
                }
            }
            if (emptyLeft) break;
        }

        // sudoku solved
        if (!emptyLeft) return true;

        // try numbers 1–9
        for (char num = '1'; num <= '9'; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;

                if (solve(board)) return true;

                // backtrack
                board[row][col] = '.';
            }
        }
        return false;
    }

    private boolean isSafe(char[][] board, int row, int col, char num) {

        // check row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) return false;
        }

        // check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) return false;
        }

        // check 3x3 box
        int sqrt = 3;
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) return false;
            }
        }

        return true;
    }
}
