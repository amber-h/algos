package problems.trees;

/*
Problem:

Write a method to see if a binary trees ↴ is "superbalanced" (a new trees property we just made up).
A trees is "superbalanced" if the difference between the depths of any two leaf nodes ↴ is no greater than one.

Here's a sample binary trees node class:
*/

public class SuperBalancedTree {

    public static class BinaryTreeNode {

        public int value;
        public BinaryTreeNode left;
        public BinaryTreeNode right;

        public BinaryTreeNode(int value) {
            this.value = value;
        }

        public BinaryTreeNode insertLeft(int leftValue) {
            this.left = new BinaryTreeNode(leftValue);
            return this.left;
        }

        public BinaryTreeNode insertRight(int rightValue) {
            this.right = new BinaryTreeNode(rightValue);
            return this.right;
        }
    }

    public static boolean isBalanced(BinaryTreeNode treeRoot) {
        // implement isBalanced
        return false;
    }


}