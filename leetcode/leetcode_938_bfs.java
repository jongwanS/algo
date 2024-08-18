//package leetcode;
//
//import javax.swing.tree.TreeNode;
//import java.util.LinkedList;
//import java.util.Queue;
//
//class Solution938 {
//
//    public int rangeSumBST(TreeNode root, int low, int high) {
//
//        int sum = 0;
//        Queue<TreeNode> que = new LinkedList();
//        que.add(root);
//        while(!que.isEmpty()){
//            TreeNode node = que.poll();
//            int val = node.val;
//            if(val >= low && val <= high){
//                sum+=val;
//            }
//
//            if(node.left != null)
//                que.add(node.left);
//            if(node.right != null)
//                que.add(node.right);
//        }
//
//        return sum;
//    }
//
//}