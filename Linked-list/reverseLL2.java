//LinkedList 92
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode before = dummy;

        // Step 1: Move `before` to node just before `left`
        for (int i = 1; i < left; i++) {
            before = before.next;
        }

        // Step 2: Reverse from left to right
        ListNode curr = before.next;
        ListNode prev = null;
        int times = right - left + 1;

        while (times-- > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Reconnect
        before.next.next = curr;  // left node connects to right+1
        before.next = prev;       // before connects to new head of reversed part

        return dummy.next;
    }
}
