package com.medium;

import com.model.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Q144 {

  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new LinkedList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode cur;
    stack.push(root);
    while (!stack.isEmpty()) {
      cur = stack.pop();
      result.add(cur.val);
      if (cur.right != null) {
        stack.add(cur.right);
      }
      if (cur.left != null) {
        stack.add(cur.left);
      }

    }
    return result;
  }
}
