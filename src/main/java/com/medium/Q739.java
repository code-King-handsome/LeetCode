package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Q739 {

  public int[] dailyTemperatures(int[] T) {
    int[] result = new int[T.length];
    HashMap<Integer, Set<Integer>> map = new HashMap<>();
    for (int i = 0; i < T.length; i++) {
      int index = 0;
      for (int j = i+1; j < T.length; j++) {
        if(T[j]>T[i]) {
          index = j;
          break;
        }
      }
      result[i] = index;
    }

    return result;
  }

  public static void main(String[] args) {
    int[] a = {73,74,75,71,69,72,76,73};
    new Q739().dailyTemperatures(a);
  }
}
