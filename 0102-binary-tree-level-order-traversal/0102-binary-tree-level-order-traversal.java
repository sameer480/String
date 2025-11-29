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
            int s=m.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode cur= m.poll();
                l.add(cur.val);
                if(cur.left!=null) m.add(cur.left);
                if(cur.right!=null) m.add(cur.right);
            }
            res.add(l);
        }
        return res;
        
    }
}