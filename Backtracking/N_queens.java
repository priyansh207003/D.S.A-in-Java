class Solution {
  //leetcode 51
    List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        queens(board, 0);
        return result;
    }

    void queens(boolean[][] board, int row) {
        if (row == board.length) {
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                queens(board, row + 1);
                board[row][col] = false;
            }
        }
    }

    boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++)
            if (board[i][col]) return false;

        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++)
            if (board[row - i][col - i]) return false;

        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++)
            if (board[row - i][col + i]) return false;

        return true;
    }

    List<String> construct(boolean[][] board) {
        List<String> list = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (boolean cell : row) {
                sb.append(cell ? 'Q' : '.');
            }
            list.add(sb.toString());
        }
        return list;
    }
}
