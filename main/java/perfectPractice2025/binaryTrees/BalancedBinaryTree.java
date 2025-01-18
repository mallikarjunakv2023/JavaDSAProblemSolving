package perfectPractice2025.binaryTrees;

import programs75.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int hLeft = height(root.left);
        if (hLeft < 0) {
            return -1;
        }
        int hRight = height(root.right);
        if (hRight < 0 || Math.abs(hLeft - hRight) > 1) {
            return -1;
        }
        return Math.max(hLeft, hRight) + 1;
    }
}
