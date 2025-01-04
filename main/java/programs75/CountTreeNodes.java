package programs75;

public class CountTreeNodes {
    public int countNodes(TreeNode root) {
        if(root==null){   // Check if root is equal to null simply return 0.
            return 0;
        }else if(root.right==null){   // If root's right side is null go to the left side and count nodes & Increse 1 for current node.
            return countNodes(root.left)+1;
        }else if(root.left==null){   // If root's left side is null go to the right side and count nodes & Increse 1 for current node.
            return countNodes(root.right)+1;
        }else{   // If root's both side having a node go to the both sides of root node and count nodes & Increse 1 for current node.
            return countNodes(root.left)+countNodes(root.right)+1;
        }
    }
}
