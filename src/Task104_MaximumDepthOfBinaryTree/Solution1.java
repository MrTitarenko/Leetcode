package Task104_MaximumDepthOfBinaryTree;

public class Solution1 {
    public int maxDepth(TreeNode root) {
        if (root != null) {
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            if (leftDepth > rightDepth) {
                return ++leftDepth;
            }
            return ++rightDepth;
        }
        return 0;
    }
}