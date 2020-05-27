package com.medium;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

public class Q071 {

  public String simplifyPath1(String path) {
    Stack<String> stack = new Stack<>();
    String[] segments = path.split("/");
    Arrays.stream(segments).filter(s -> Objects.nonNull(s) && !s.isEmpty()).forEach(
        s -> {
          if ("..".equals(s)) {
            if (!stack.isEmpty()) {
              stack.pop();
            }
          } else if(!".".equals(s)){
            stack.push(s);
          }
        }
    );
    return "/" + String.join("/", stack);
  }

  public String simplifyPath(String path) {
    Stack<String> stack = new Stack<>();
    String[] segments = path.split("/");
    for(String segment:segments) {
      if (Objects.nonNull(segment) && !segment.isEmpty()) {
        if ("..".equals(segment)) {
          if (!stack.isEmpty()) {
            stack.pop();
          }
        } else if(!".".equals(segment)){
          stack.push(segment);
        }
      }
    }
    return "/" + String.join("/", stack);
  }

  public static void main(String[] args) {
    System.out.println(new Q071().simplifyPath1("/a//b////c/d//././/.."));
  }
}
