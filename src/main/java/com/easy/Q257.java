package com.easy;

import com.model.TreeNode;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Q257 {

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<String> result = new LinkedList<>();
        expandTreePaths(root, "", result);
        return result;
    }

    private void expandTreePaths(TreeNode node, String path, List<String> result) {
        TreeNode left = node.left;
        TreeNode right = node.right;
        if (left == null && right == null) {
            result.add(path + node.val);
        }
        if (left != null) {
            expandTreePaths(left, path + node.val + "->", result);
        }
        if (right != null) {
            expandTreePaths(right, path + node.val + "->", result);
        }
    }
}
