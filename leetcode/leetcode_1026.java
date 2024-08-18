//package leetcode;
//
//import javax.swing.tree.TreeNode;
//
//class Solution1026 {
//    public int maxAncestorDiff(TreeNode root) {
//
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        int res = maxAncestorDiff(root, min, max);
//        return res;
//    }
//
//    public int maxAncestorDiff(TreeNode root, int min, int max) {
//
//        if(root == null) return Math.abs(max-min);
//        if(root == null) return Math.abs(max-min);
//        //최소,최대 갱신
//        max = Math.max(max,root.val);
//        min = Math.min(min,root.val);
//        int lMax = maxAncestorDiff(root.left, min, max);
//        int rMax = maxAncestorDiff(root.right, min, max);
//
//        return Math.max(lMax,rMax);
//    }
//}