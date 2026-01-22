//This is the leetcode problem number 25
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        for(int i =0;i<k;i++){
            if(cur==null)return head;
            cur = cur.next;
        }
        ListNode prev = null;
        ListNode curr = head;

        for(int i=0;i<k;i++){
            ListNode next = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = next;
        }
        head.next = reverseKGroup(cur,k);
        return prev;
    }
}
