package com.defers.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfLeftLeaves404Test {
    @Test
    public void testSolution1() {
        var leafLeft2 = new SumOfLeftLeaves404.TreeNode(15, null, null);
        var leafRight2 = new SumOfLeftLeaves404.TreeNode(7, null, null);
        var leafLeft1 = new SumOfLeftLeaves404.TreeNode(9, null, null);
        var leafRight1 = new SumOfLeftLeaves404.TreeNode(20, leafLeft2, leafRight2);
        var leaf1 = new SumOfLeftLeaves404.TreeNode(3, leafLeft1, leafRight1);

        var testClass = new SumOfLeftLeaves404();
        assertEquals(24, testClass.sumOfLeftLeaves(leaf1));
    }

    @Test
    public void testSolution2() {
        var leafLeft2 = new SumOfLeftLeaves404.TreeNode(4, null, null);
        var leafRight2 = new SumOfLeftLeaves404.TreeNode(5, null, null);
        var leafLeft1 = new SumOfLeftLeaves404.TreeNode(2, leafLeft2, leafRight2);
        var leafRight1 = new SumOfLeftLeaves404.TreeNode(3, null, null);
        var leaf1 = new SumOfLeftLeaves404.TreeNode(1, leafLeft1, leafRight1);

        var testClass = new SumOfLeftLeaves404();
        assertEquals(4, testClass.sumOfLeftLeaves(leaf1));
    }
}