package com.high;

import java.util.Stack;

public class Q042 {

  public int trap(int[] height) {
    Stack<Integer> stack = new Stack<>();
    int cur = 0, sum = 0;
    while (cur < height.length) {
      while (!stack.isEmpty() && height[cur] > height[stack.peek()]) {
        int top = stack.pop();
        if (stack.isEmpty()) {
          break;
        }
        int distance = cur - top - 1;
        int heightDifference = Math.min(height[cur], height[stack.peek()]) - height[top];
        sum += distance * heightDifference;
      }
      stack.push(cur++);
    }
    return sum;
  }

}
