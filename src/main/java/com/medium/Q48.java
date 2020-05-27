package com.medium;

public class Q48 {
  public void rotate(int[][] matrix) {
    int len = matrix.length;
    int tmp;
    for (int row = 0; row < len / 2; row++) {
      for (int col = row; col < len - row - 1; col++) {
        tmp = matrix[len-1-col][row];
        matrix[len-1-col][row] = matrix[len - 1 - row][len - 1 - col];
        matrix[len - 1 - row][len - 1 - col] = matrix[col][len-1-row];
        matrix[col][len-1-row] = matrix[row][col];
        matrix[row][col] = tmp;
      }
    }
  }

  public static void main(String[] args) {
    int[][] a = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int[][] b = {
        {5, 1, 9,11},
        {2, 4, 8,10},
        {13, 3, 6, 7},
        {15,14,12,16}
    };
    new Q48().rotate(a);
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}
