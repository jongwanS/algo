//package leetcode;
//
//import javax.swing.tree.TreeNode;
//
//class Solution {
//    public TreeNode insertIntoBST(TreeNode root, int val) {
//        if(root == null){
//            return new TreeNode(val);
//        }
//        TreeNode tmp = root;
//        insertBST(tmp, val);
//        return root;
//    }
//
//    public TreeNode insertBST(TreeNode root, int val) {
//        if(root == null){
//            root = new TreeNode(val);
//            return root;
//        }
//
//        if(root.val < val){
//            root.right = insertBST(root.right, val);
//        }else{
//            root.left = insertBST(root.left, val);
//        }
//
//        return root;
//    }
//}