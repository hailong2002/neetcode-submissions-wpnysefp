class Solution {
    public boolean isValidSudoku(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      if (isValidRow(board, i, board.length) && isValidColumn(board, i, board.length)) {
        continue;
      }
      return false;
    }
    return isValidSubBox(board);
  }

  private boolean isValidRow(char[][] board, int rowNum, int size) {
      for (char[] chars : board) {
          for (int j = rowNum+1; j < size; j++) {
              if (chars[rowNum] != '.' && chars[rowNum] == chars[j]) {
                  return false;
              }
          }
      }
    return true;
  }

  private boolean isValidColumn(char[][] board, int columnNum, int size) {
    for (int i = 0; i < board.length; i++) {
      for (int j = columnNum + 1; j < size; j++) {
        if (board[columnNum][i] != '.' && board[columnNum][i] == board[j][i]) {
          return false;
        }
      }
    }
    return true;
  }

    private boolean isValidSubBox(char[][] board) {
    for (int row = 0; row < 9; row += 3) {
      for (int col = 0; col < 9; col += 3) {

        boolean[] seen = new boolean[10];


        for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
            char current = board[row + i][col + j];

            if (current != '.') {
              int num = current - '0';
              if (seen[num]) {
                return false; 
              }
              seen[num] = true;
            }
          }
        }
      }
    }
    return true;
  }

}
