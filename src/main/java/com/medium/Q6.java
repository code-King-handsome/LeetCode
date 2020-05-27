package com.medium;

public class Q6 {

  public static void main(String[] args) {
    String res = new Q6().convert("LEETCODEISHIRING", 3);
    System.out.println(res);
  }

  public String convert(String s, int numRows) {
    if (numRows == 1) {
      return s;
    }

    int len = s.length();
    int interval = numRows * 2 - 2;
    StringBuilder builder = new StringBuilder();
    for (int row = 0; row < numRows; row++) {
      boolean flag = (row != 0 && row != (numRows - 1));
      StringBuilder tmp = new StringBuilder();

      for (int i = 0; i <= (len - row) / interval; i++) {
        int index = row + interval * i;
        tmp.append(s.charAt(index));
        if (flag) {
          tmp.append(s.charAt(interval * (i + 1) - row));
        }
      }
      builder.append(new String(tmp));
    }
    return builder.toString();
  }
}
