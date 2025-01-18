package perfectPractice2025.binaryTrees;

import programs75.TreeNode;

public class IdenticalTrees {
    public boolean isSameTree(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        // If only one of the nodes is NULL, they are not identical
        if (node1 == null || node2 == null) {
            return false;
        }
        // Check if the current nodes have the same data value
        // and recursively check their left and right subtrees
        return ((node1.val == node2.val)
                && isSameTree(node1.left, node2.left)
                && isSameTree(node1.right, node2.right));
    }
}
