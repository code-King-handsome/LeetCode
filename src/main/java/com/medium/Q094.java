package com.medium;

import com.model.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Q094 {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new LinkedList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode cur = root;
    while (cur != null && !stack.isEmpty()) {
      while (cur != null) {
        stack.push(cur);
        cur = cur.left;
      }
      cur = stack.pop();
      result.add(cur.val);
      cur = cur.right;
    }
    return result;
  }
}
