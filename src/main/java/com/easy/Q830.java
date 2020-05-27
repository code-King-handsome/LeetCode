package com.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q830 {

  public List<List<Integer>> largeGroupPositions(String S) {
    List<List<Integer>> biggerLists = new ArrayList<>();
    char current = S.charAt(0);
    int count = 1;
    for (int i = 1; i < S.length(); i++) {
      if (current == S.charAt(i)) {
        count++;
      } else {
        if (count >= 3) {
          biggerLists.add(Arrays.asList(i-count, i-1));
        }
        current = S.charAt(i);
        count = 1;
      }
    }
    return biggerLists;
  }

}
