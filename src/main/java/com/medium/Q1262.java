package com.medium;

import java.util.Arrays;

public class Q1262 {

  public int maxSumDivThree(int[] nums) {
    int max = 0;
    int sum = Arrays.stream(nums).sum();
    if (sum % 3 == 0) {
      return sum;
    }
    int layer = 0;


    return max;
  }

}
