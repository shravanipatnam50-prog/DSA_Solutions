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
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) 
    {
        solve(root, targetSum);
        return result;
    }
    public void solve(TreeNode root, int targetSum) 
    {
        if(root == null) 
        {
            return;
        }
        path.add(root.val);
        targetSum = targetSum - root.val;
        if(root.left == null && root.right == null) 
        {
            if(targetSum == 0) 
            {
                result.add(new ArrayList<>(path));
            }
        }
        solve(root.left, targetSum);
        solve(root.right, targetSum);
        path.remove(path.size() - 1);
    }
}
