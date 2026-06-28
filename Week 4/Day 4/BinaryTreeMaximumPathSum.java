public class BinaryTreeMaximumPathSum {
    private int globalMax = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        pathSumHelper(root);
        return globalMax;
    }

    private int pathSumHelper(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftMax = Math.max(0, pathSumHelper(node.left));
        int rightMax = Math.max(0, pathSumHelper(node.right));
        
        int localSum = node.val + leftMax + rightMax;
        globalMax = Math.max(globalMax, localSum);
        
        return node.val + Math.max(leftMax, rightMax);
    }

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode() {}
        public TreeNode(int val) { this.val = val; }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}