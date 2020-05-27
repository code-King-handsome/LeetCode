package com.model;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode(Integer[] nums) {
        TreeNode root = new TreeNode(nums[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        for (int i = 1; i < nums.length; ) {
            TreeNode node = queue.poll();
            if (nums[i] != null) {
                node.left = new TreeNode(nums[i]);
                queue.add(node.left);
            }
            i++;
            if (nums[i] != null) {
                node.right = new TreeNode(nums[i]);
                queue.add(node.right);
            }
            i++;

            if (i == 3){
                this.left = node.left;
                this.right = node.right;
                this.val = nums[0];
            }

        }
    }
}
