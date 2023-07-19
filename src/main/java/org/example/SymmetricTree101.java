package org.example;

public class SymmetricTree101 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode leftSubtree = new TreeNode(2);
        TreeNode rightSubtree = new TreeNode(2);
        TreeNode leftSubtreeLeft = new TreeNode(3);
        TreeNode leftSubtreeRight = new TreeNode(4);
        TreeNode rightSubtreeLeft = new TreeNode(4);
        TreeNode rightSubtreeRight = new TreeNode(3);
        root.left = leftSubtree;
        root.right = rightSubtree;
        leftSubtree.left = leftSubtreeLeft;
        leftSubtree.right = leftSubtreeRight;
        rightSubtree.left = rightSubtreeLeft;
        rightSubtree.right = rightSubtreeRight;
       System.out.println(isSymmetric(root));

    }


    public static boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }
            return  isMiror(root.left,root.right);
    }
    public static boolean isMiror( TreeNode left, TreeNode right){
        if (left == null &&  right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.val==right.val && isMiror(left.left,right.right) && isMiror(left.right,right.left);
    }
}
