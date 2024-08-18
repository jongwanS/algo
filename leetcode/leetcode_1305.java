//package leetcode;
//
//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//class Solution1305 {
//    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
//        List<Integer> res = new ArrayList<>();
//
//        getElements(root1, res);
//        getElements(root2, res);
//        Collections.sort(res);
//        return res;
//    }
//
//    public static void getElements(TreeNode node, List<Integer> list){
//    	//dfs
//        if(node == null) return;
//        getElements(node.left, list);
//        getElements(node.right, list);
//        list.add(node.val);
//    }
//}