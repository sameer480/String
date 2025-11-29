class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        // If it's a leaf node
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        // Recur on left and right with reduced targetSum
        int newSum = targetSum - root.val;

        return hasPathSum(root.left, newSum) || hasPathSum(root.right, newSum);
    }
}
