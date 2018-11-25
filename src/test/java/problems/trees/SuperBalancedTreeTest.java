package problems.trees;

import org.junit.Test;

import static org.junit.Assert.*;
import static problems.trees.SuperBalancedTree.isBalanced;

public class SuperBalancedTreeTest {

    @Test
    public void fullTreeTest() {
        final SuperBalancedTree.BinaryTreeNode root = new SuperBalancedTree.BinaryTreeNode(5);
        final SuperBalancedTree.BinaryTreeNode a = root.insertLeft(8);
        final SuperBalancedTree.BinaryTreeNode b = root.insertRight(6);
        a.insertLeft(1);
        a.insertRight(2);
        b.insertLeft(3);
        b.insertRight(4);
        final boolean result = isBalanced(root);
        assertTrue(result);
    }

    @Test
    public void bothLeavesAtTheSameDepthTest() {
        final SuperBalancedTree.BinaryTreeNode root = new SuperBalancedTree.BinaryTreeNode(3);
        root.insertLeft(4).insertLeft(1);
        root.insertRight(2).insertRight(9);
        final boolean result = isBalanced(root);
        assertTrue(result);
    }

    @Test
    public void leafHeightsDifferByOneTest() {
        final SuperBalancedTree.BinaryTreeNode root = new SuperBalancedTree.BinaryTreeNode(6);
        root.insertLeft(1);
        root.insertRight(0).insertRight(7);
        final boolean result = isBalanced(root);
        assertTrue(result);
    }

    @Test
    public void leafHeightsDifferByTwoTest() {
        final SuperBalancedTree.BinaryTreeNode root = new SuperBalancedTree.BinaryTreeNode(6);
        root.insertLeft(1);
        root.insertRight(0).insertRight(7).insertRight(8);
        final boolean result = isBalanced(root);
        assertFalse(result);
    }

    @Test
    public void bothSubTreesSuperbalancedTest() {
        final SuperBalancedTree.BinaryTreeNode root = new SuperBalancedTree.BinaryTreeNode(1);
        root.insertLeft(5);
        final SuperBalancedTree.BinaryTreeNode b = root.insertRight(9);
        b.insertLeft(8).insertLeft(7);
        b.insertRight(5);
        final boolean result = isBalanced(root);
        assertFalse(result);
    }

    @Test
    public void onlyOneNodeTest() {
        final SuperBalancedTree.BinaryTreeNode root = new SuperBalancedTree.BinaryTreeNode(1);
        final boolean result = isBalanced(root);
        assertTrue(result);
    }

    @Test
    public void treeIsLinkedListTest() {
        final SuperBalancedTree.BinaryTreeNode root = new SuperBalancedTree.BinaryTreeNode(1);
        root.insertRight(2).insertRight(3).insertRight(4);
        final boolean result = isBalanced(root);
        assertTrue(result);
    }

}
