package Task104_MaximumDepthOfBinaryTree;

public class Main {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node4.left = node5;

        long time1 = System.nanoTime();
        int answer = solution.maxDepth(node1);
        long time2 = System.nanoTime();

        System.out.println(answer);
        System.out.println((time2-time1)/1000);
    }
}

