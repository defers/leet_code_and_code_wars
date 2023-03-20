package com.defers.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTree104Test {

    @Test
    void testSolution() {
        MaximumDepthOfBinaryTree104.TreeNode treeNode7 =
                new MaximumDepthOfBinaryTree104.TreeNode(7, null, null);
        MaximumDepthOfBinaryTree104.TreeNode treeNode15 =
                new MaximumDepthOfBinaryTree104.TreeNode(15, null, null);
        MaximumDepthOfBinaryTree104.TreeNode treeNode20 =
                new MaximumDepthOfBinaryTree104.TreeNode(20, treeNode15, treeNode7);
        MaximumDepthOfBinaryTree104.TreeNode treeNode9 =
                new MaximumDepthOfBinaryTree104.TreeNode(9, null, null);
        MaximumDepthOfBinaryTree104.TreeNode treeNode3 =
                new MaximumDepthOfBinaryTree104.TreeNode(3, treeNode9, treeNode20);
        var testClass = new MaximumDepthOfBinaryTree104();

        int maxDepth = testClass.maxDepth(treeNode3);
        Assertions.assertEquals(3, maxDepth);
    }
}