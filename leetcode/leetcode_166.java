package leetcode;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

// Definition for a Node.



import java.util.LinkedList;
import java.util.Queue;

//class Node166 {
//    public int val;
//    public Node166 left;
//    public Node166 right;
//    public Node166 next;
//
//    public Node166() {}
//
//    public Node166(int _val) {
//        val = _val;
//    }
//
//    public Node166(int _val, Node166 _left, Node166 _right, Node166 _next) {
//        val = _val;
//        left = _left;
//        right = _right;
//        next = _next;
//    }
//};
//
//class Solution166 {
//    public Node166 connect(Node166 root) {
//        if(root == null) return root;
//
//        Queue<Node> que = new LinkedList<>();
//
//        que.add(root);
//        //DFS
//        while(!que.isEmpty()){
//
//            int size = que.size();
//
//            //루프를 도는이유는 같은레벨을 찾기위해
//            for(int i=0;i<size;i++){
//                //현재노드를 꺼낸다.
//                Node166 node = que.poll();
//
//                if(node.left != null) que.add(node.left);
//                if(node.right != null) que.add(node.right);
//
//                if(i < size-1){
//                    //같은 레벨의 경우 연결을 시켜준다.
//                    //같은 레벨의 마지막 노드는 미연결  i < size-1
//                    node.next = que.peek();
//                }
//            }
//        }
//        return root;
//    }
//}