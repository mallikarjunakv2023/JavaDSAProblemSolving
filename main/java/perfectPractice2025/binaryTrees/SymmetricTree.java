package perfectPractice2025.binaryTrees;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isSymmetricCheck(root.left, root.right);
    }

    private boolean isSymmetricCheck(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;

        if (left == null || right == null)
            return false;

        if (left.val != right.val)
            return false;

        return isSymmetricCheck(left.left, right.right) && isSymmetricCheck(left.right, right.left);
    }
}
