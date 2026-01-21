class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // 1. Find length and tail
        ListNode temp = head;
        int n = 1;
        while (temp.next != null) {
            temp = temp.next;
            n++;
        }
        // temp is now at tail

        // 2. Make list circular
        temp.next = head;

        // 3. Optimize k
        k = k % n;
        if (k == 0) {
            temp.next = null;
            return head;
        }

        // 4. Find new tail
        int jump = n - k;
        while (jump --> 0) {
            temp = temp.next;
        }

        // 5. Break the circle
        ListNode newHead = temp.next;
        temp.next = null;

        return newHead;
    }
}
