/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> m= new LinkedList<>();
        m.add(root);
        while(!m.isEmpty()){
            List<Integer> r= new ArrayList<>();
            int s=m.size();
            for(int i=0;i<s;i++){
                TreeNode c=m.poll();
                r.add(c.val);
                if(c.left!=null) m.add(c.left);
                if(c.right!=null) m.add(c.right);
            }
            res.add(r);
        }
return res;
    }
}