/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        Deque<ListNode> que = new LinkedList<>();
        
        ListNode curr = head.next;
        while(curr != null){
            que.add(curr);
            curr = curr.next;
        }
        curr = head;
        while(!que.isEmpty()) {
        	if(que.isEmpty()) break;
        	ListNode top = que.pollLast();
        	top.next=null;
        	curr.next = top;
        	
        	if(que.isEmpty()) break;
            ListNode bot = que.pollFirst();
            bot.next = null; 
            top.next = bot;
            curr = bot;
        }
    }
}