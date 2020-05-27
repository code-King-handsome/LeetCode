package com.easy;

import java.util.Stack;
import java.util.stream.Stream;

public class Q020 {

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for(char c: s.toCharArray()){
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else if (c == ')' || c == '}' || c == ']') {
        if (stack.isEmpty()) {
          return false;
        }
        char top = stack.pop();
        switch (top) {
          case '(':
            if (c != ')') {
              return false;
            }
            break;
          case '{':
            if (c != '}') {
              return false;
            }
            break;
          case '[':
            if (c != ']') {
              return false;
            }
            break;
          default:
            return false;
        }
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    new Q020().isValid("()");
  }
}
