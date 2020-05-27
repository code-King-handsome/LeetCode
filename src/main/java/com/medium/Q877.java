package com.medium;

import java.util.Arrays;

public class Q877 {

  public boolean stoneGame(int[] piles) {
    int first = subSum(piles, 0, piles.length -1 );
    int sum = Arrays.stream(piles).sum();
    return first > sum - first;
  }

  public int subSum(int[] piles, int start, int end) {
    if (end - start == 1) {
      return Math.max(piles[start], piles[end]);
    }
    return Math.max(piles[start], piles[end]) + subSum(piles, start + 1, end -1);
  }

}
