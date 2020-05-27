package com.war;

import com.model.TreeNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class IsoGram {

    public static boolean  isIsogram(String str) {
        if (str == null || "".equals(str)) {
            return true;
        }
        HashSet<Character> set = new HashSet<>();
        for (char c: str.toLowerCase().toCharArray()) {
            if (c < 'a' || c > 'z'|| set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Stack<List<Integer>> stack = new Stack<>();
        if (root == null) {
            return new LinkedList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int width = queue.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < width; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            stack.push(list);
        }
        List<List<Integer>> result = new LinkedList<>();
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;

    }
}
