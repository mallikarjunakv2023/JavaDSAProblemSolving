package perfectPractice2025.binaryTrees;

import programs75.TreeNode;

public class MaxPathSum {
    int maxPathSum(TreeNode root) {
        int[] maxi = { Integer.MIN_VALUE };
        findMaxPathSum(root, maxi);
        return maxi[0];
    }

    int findMaxPathSum(TreeNode root, int[] maxi) {
        if (root == null)
            return 0;

        // Calculate the maximum path sum for the left and right subtrees
        int leftMaxPath = Math.max(0, findMaxPathSum(root.left, maxi));
        int rightMaxPath = Math.max(0, findMaxPathSum(root.right, maxi));

        // Update the overall maximum path sum including the current node
        maxi[0] = Math.max(maxi[0], leftMaxPath + rightMaxPath + root.val);

        // Return the maximum sum considering only one branch (either left or right)
        // along with the current node
        return Math.max(leftMaxPath, rightMaxPath) + root.val;
    }
}
