//package leetcode;
//
//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//
//class Solution98 {
//    public boolean isValidBST(TreeNode root) {
//        ArrayList<Integer> list = new ArrayList<>();
//        inOrder(list,root);
//        int n = list.size();
//        for(int i=0;i<n-1;i++){
//            if(list.get(i)>=list.get(i+1)){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void inOrder(ArrayList<Integer>list,TreeNode root){
//        if(root==null){
//            return;
//        }
//        inOrder(list,root.left);
//        list.add(root.val);
//        inOrder(list,root.right);
//    }
//}