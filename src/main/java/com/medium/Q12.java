package com.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q12 {

  public String intToRoman(int num) {
    Iterator<RomanNum> romanNums = Arrays.asList(RomanNum.ONES, RomanNum.TENS, RomanNum.HUNDREDS, RomanNum.THOUSANDS).iterator();
    if (num <=0 || num >= 4000) {
      throw new UnsupportedOperationException();
    }
    Stack<Character> stack = new Stack<>();
    while (num != 0) {
      RomanNum romanNum = romanNums.next();
      int current = num % 10;
      num = num / 10;
      if (current < 4 && current > 0){
        IntStream.range(0, current).forEach(i -> stack.push(romanNum.one));
      } else if (current == 4) {
        stack.push(romanNum.five);
        stack.push(romanNum.one);
      } else if (current == 5) {
        stack.push(romanNum.five);
      } else if (current > 5) {
        stack.push(romanNum.five);
        IntStream.range(0, current - 5).forEach(i -> stack.push(romanNum.one));
      }
    }
    return "";
  }

  enum RomanNum {
    ONES('I', 'V'),
    TENS('X', 'L'),
    HUNDREDS('C', 'D'),
    THOUSANDS('M', '?');

    private char one;
    private char five;
    RomanNum(char one, char five) {
      this.one = one;
      this.five = five;
    }
  }
}
