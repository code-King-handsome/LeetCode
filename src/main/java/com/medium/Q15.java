package com.medium;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q15 {

  public List<List<Integer>> threeSum(int[] nums) {
    List<Integer> distinctNums = Arrays.stream(nums).boxed().sorted().collect(toList());
    Map<String, List<Integer>> result = new HashMap<>();
    int a,b,c;
    for (int i = 0; i < distinctNums.size() - 2; i++) {
      for (int j = i + 1; j < distinctNums.size() - 1; j++) {
        for (int k = j + 1; k < distinctNums.size(); k++) {
          a = distinctNums.get(i);
          b = distinctNums.get(j);
          c = distinctNums.get(k);
          if ((a+b+c) == 0) {
            result.put(a+""+b+""+c, Arrays.asList(a, b, c));
          }
        }
      }

    }
    return new ArrayList<>(result.values());
  }

  public static void main(String[] args) {
    List<List<Integer>> lists = new Q15().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    System.out.println(lists.size());
    for (List<Integer> list :lists) {
      list.forEach(System.out::print);
    }
    System.out.println();
  }
}
