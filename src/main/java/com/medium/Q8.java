package com.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q8 {

  public static void main(String[] args) {
    int sum = new Q8().myAtoi("4193 with words");
    System.out.println(sum);
  }

  public int myAtoi(String str) {
    if (str == null || "".equals(str)) {
      return 0;
    }
    Character[] retainChars = {'-', '+', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    Set<Character> retains = Arrays.stream(retainChars).collect(Collectors.toSet());
    for (int i = 0; i < str.length(); i++) {
      char cur = str.charAt(i);
      if(cur == ' '){
        continue;
      }
      if (Character.isAlphabetic(cur)) {
        return 0;
      } else {
        break;
      }
    }
    List<Character> list = str.chars().mapToObj(i -> (char) i).filter(retains::contains).collect(Collectors.toList());
    if (list.isEmpty()) {
      return 0;
    }
    int flag = list.get(0) == '-' ? -1 : 1;
    int sum = list.stream().filter(c -> c != '-' && c != '+').mapToInt(c -> c - '0').reduce(0, (sub, ele) -> sub * 10 + ele);
    sum = sum * flag;
    sum = Math.min(sum, Integer.MAX_VALUE);
    sum = Math.max(sum, Integer.MIN_VALUE);
    return sum;
  }

  public void revert (int[] target) {
    int len = target.length;
    int[] result = new int[len];
  }

}
