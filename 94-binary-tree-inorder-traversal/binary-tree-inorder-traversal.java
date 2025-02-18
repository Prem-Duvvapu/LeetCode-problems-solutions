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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if (root==null)
            return res;

        Stack<TreeNode> stack=new Stack<>();
        TreeNode curr=root;

        while (true) {
            if (curr!=null) {
                stack.add(curr);
                curr=curr.left;
            } else {
                if (stack.isEmpty())
                    break;

                curr=stack.pop();
                res.add(curr.val);
                curr=curr.right;
            }
        }

        return res;
    }
}