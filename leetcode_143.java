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
        
        //첫번째 노드는 제외하므로 다음 인덱스부터 reorder 대상에 넣음
        ListNode curr = head.next;
        //모든 노드를 que 에 담는다.
        while(curr != null){
            que.add(curr);
            curr = curr.next;
        }
        //curr 을 head 정보로 다시 갱신
        curr = head;
        //큐에 넣은 값중 맨 위에꺼, 아래꺼 순으로 꺼내 링크를 연결시켜준다.
        while(!que.isEmpty()) {
        	
        	if(que.isEmpty()) break;
        	ListNode top = que.pollLast();
        	top.next=null;
        	curr.next = top;
        	
        	if(que.isEmpty()) break;
            ListNode bot = que.pollFirst();
            bot.next = null; 
            top.next = bot;
            
            //curr 을 bot 인덱스로 가르키는 이유는 그 다음 while문때 다음 인덱스를 가르킬수 있게 하기위함
            curr = bot;
        }
    }
}