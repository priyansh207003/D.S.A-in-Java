public class n_knight {

  static void knights(boolean[][] board, int r, int c, int knights) {

    if (knights == 0) {
      display(board);
      System.out.println();
      return;
    }

    if (r == board.length) {
      return;
    }

    if (c == board.length) {
      knights(board, r + 1, 0, knights);
      return;
    }

    // place knight
    if (isSafe(board, r, c)) {
      board[r][c] = true;
      knights(board, r, c + 1, knights - 1);
      board[r][c] = false; // backtrack
    }

    // don't place knight
    knights(board, r, c + 1, knights);
  }

  private static boolean isSafe(boolean[][] board, int row, int col) {
    int[][] moves = {
      {-2, -1}, {-2, 1}, {-1, 2}, {-1, -2}
    };

    for (int[] m : moves) {
      int r = row + m[0];
      int c = col + m[1];
      if (isValid(board, r, c) && board[r][c]) {
        return false;
      }
    }
    return true;
  }

  private static boolean isValid(boolean[][] board, int row, int col) {
    return row >= 0 && row < board.length && col >= 0 && col < board.length;
  }

  private static void display(boolean[][] board) {
    for (boolean[] row : board) {
      for (boolean cell : row) {
        System.out.print(cell ? "K " : "X ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n = 4;
    boolean[][] board = new boolean[n][n];
    knights(board, 0, 0, 4);
  }
}
