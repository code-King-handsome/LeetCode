package com.medium;

public class Q79 {

  private int row;
  private int col;
  private char[][] board;
  private boolean[][] marked;
  private char[] wordToChar;
  private int[][] neighbors = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

  public boolean exist(char[][] board, String word) {
    this.row = board.length;
    this.col = board[0].length;
    this.board = board;
    this.marked = new boolean[row][];
    this.wordToChar = word.toCharArray();
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (dfs(i, j, 0)) {
          return true;
        }
      }
    }
    return false;
  }

  private boolean dfs(int x, int y, int index) {
    if (index == neighbors.length - 1) {
      return board[x][y] == wordToChar[index];
    }
    if (board[x][y] == wordToChar[index]) {
      marked[x][y] = true;
      for (int[] neighbor : neighbors) {
        int newX = x + neighbor[0];
        int newY = y + neighbor[1];
        if (inArea(newX, newY) && !marked[newX][newY] && dfs(newX, newY, index + 1)){
          return true;
        }
      }
    }
    return false;
  }

  private boolean inArea(int x, int y){
    return (x >= 0 && x < row) && (y >= 0 && y < col);
  }

  public static void main(String[] args) {

//        char[][] board =
//                {
//                        {'A', 'B', 'C', 'E'},
//                        {'S', 'F', 'C', 'S'},
//                        {'A', 'D', 'E', 'E'}
//                };
//
//        String word = "ABCCED";


  }

}
