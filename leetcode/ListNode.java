package leetcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Definition for singly-linked list.
 */
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length == 0){
            return null;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for(ListNode node : lists){
            while(node != null){
                arr.add(node.val);
                node = node.next;
            }
        }
        if(arr.size() == 0){
            return null;
        }
        Collections.sort(arr);


        ListNode node = new ListNode(arr.get(0));
        ListNode tmp = node;
        for(int i=1;i<arr.size();i++){
            ListNode nodeNext = new ListNode(arr.get(i));
            tmp.next = nodeNext;
            tmp = tmp.next;
        }
        
        
        return node;    
    }
}