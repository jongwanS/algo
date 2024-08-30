package leetcode;


public class PathSum112 {
    private boolean bol = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum, 0);
        return bol;
    }

    public void dfs(TreeNode root, int targetSum, int sum){
        if(root == null) return;
        if(root.left == null && root.right == null){
            if(root.val+sum == targetSum) bol = true;
        }

        dfs(root.left, targetSum, root.val+sum);
        dfs(root.right, targetSum, root.val+sum);
    }

    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
    }

}
