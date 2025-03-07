package perfectPractice2025.binaryTrees;

import programs75.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RightView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        rightSideView(root, list, 0);
        return list;
    }

    private void rightSideView(TreeNode root, List<Integer> list, int currentLevel) {
        if (root == null)
            return;
        if (currentLevel >= list.size()) {
            list.add(root.val);
        }
        rightSideView(root.right, list, currentLevel + 1);
        rightSideView(root.left, list, currentLevel + 1);
    }
}
