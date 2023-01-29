package com.defers.leetcode;

//Given the root of a binary tree, return the sum of all left leaves.
//A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

public class SumOfLeftLeaves404 {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumRecursiveLeft(root, false);
    }

    private int sumRecursiveLeft(TreeNode treeNode, boolean left) {
        if (treeNode == null) {
            return 0;
        }
        if (treeNode.left == null && treeNode.right == null) {
            return left ? treeNode.val : 0;
        }
        else if (treeNode.left == null) {
            return sumRecursiveLeft(treeNode.right, false);
        }
        else if (treeNode.right == null) {
            return sumRecursiveLeft(treeNode.left, true);
        }

        return sumRecursiveLeft(treeNode.left, true) + sumRecursiveLeft(treeNode.right, false);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
