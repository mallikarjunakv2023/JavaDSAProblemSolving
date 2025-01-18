package perfectPractice2025.binaryTrees;

import programs75.TreeNode;

import java.util.*;

public class ZigZag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < levelSize; ++i) {
                TreeNode node = q.poll();
                l.add(node.val);
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
            // this is the additional step you need to perform :)
            if (level % 2 != 0)
                Collections.reverse(l);
            ans.add(l);
            level++;
        }

        return ans;
    }
}
