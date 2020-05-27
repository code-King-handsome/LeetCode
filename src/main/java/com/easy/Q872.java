package com.easy;

import com.model.TreeNode;

public class Q872 {

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
//        if (root1 == null && root2 == null) {
//            return true;
//        }
//        if (root1 == null || root2 == null) {
//            return false;
//        }
//        Stack<TreeNode> stack = new Stack<>();
//        Queue<Integer> leafQueue = new LinkedList<>();
//        stack.push(root1);
//        while (!stack.isEmpty()) {
//            TreeNode node = stack.pop();
//            if (node.left == null && node.right == null) {
//                leafQueue.add(node.val);
//            }
//            if (node.left != null) {
//                stack.push(node.right);
//            }
//            if (node.right != null) {
//                stack.push(node.left);
//            }
//        }
//        stack.push(root2);
//        while (!stack.isEmpty()) {
//            TreeNode node = stack.pop();
//            if (node.left == null && node.right == null) {
//                if (leafQueue.poll() != node.val){
//                    return false;
//                }
//            }
//            if (node.left != null) {
//                stack.push(node.right);
//            }
//            if (node.right != null) {
//                stack.push(node.left);
//            }
//        }
        return true;
    }

//    public static void main(String[] args) {
//        Integer[] tree1 = {3,5,1,6,2,9,8,null,null,7,4};
//        TreeNode root1 = new TreeNode(tree1);
//        Integer[] tree2 = {3,5,1,6,7,4,2,null,null,null,null,null,null,9,8};
//        TreeNode root2 = new TreeNode(tree2);
//        System.out.println(leafSimilar(root1, root2));
//    }
}
