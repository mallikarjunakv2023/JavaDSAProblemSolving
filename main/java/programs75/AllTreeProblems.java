package programs75;

public class AllTreeProblems {

    public static void main(String[] args) {
        //CountCompleteTreeNodes tn = new CountCompleteTreeNodes();
    }
    class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(){

        }
        TreeNode(int value){
            this.value = value;
        }
        TreeNode(int value, TreeNode left, TreeNode right){
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * Count all tree nodes
     * @param root
     * @return
     */
    public static int countNodes(TreeNode root){
        if(root == null){
            return 0;
        }
        else if(root.left == null){
            return countNodes(root.right) + 1;
        }
        else if (root.right == null) {
            return countNodes(root.left) + 1;
        }
        else{
            return countNodes(root.left) + countNodes(root.left) + 1;
        }
    }

    /**
     * Path sum
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return rootToLeafPathSum(root, targetSum, sum);
    }
    public boolean rootToLeafPathSum(TreeNode root, int targetSum, int sum){
        if(root == null)
            return false;
        if(root.left == null && root.right == null){
            sum = sum + root.value;
            if(sum == targetSum)
                return true;
        }
        return rootToLeafPathSum(root.left, targetSum, sum + root.value) || rootToLeafPathSum(root.right, targetSum, sum + root.value);
    }

    /**
     * Invert Binary Tree
     */
    public TreeNode invertTree(TreeNode root) {
        // Base case: if the tree is empty...
        if(root == null){
            return root;
        }
        // Call the function recursively for the left subtree...
        invertTree(root.left);
        // Call the function recursively for the right subtree...
        invertTree(root.right);
        // Swapping process...
        TreeNode curr = root.left;
        root.left = root.right;
        root.right = curr;
        return root;
    }

    /**
     * Max depth of Tree
     */
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return Math.max(l,r)+1;
    }

    /**
     * Symmetric tree
     */

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.value == node2.value && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }

}
