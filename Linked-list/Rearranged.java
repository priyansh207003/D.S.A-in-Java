//This is the leetcode question number 143
class Solution {
    public void reorderList(ListNode head) {
         if (head == null || head.next == null) return;
        //Find Middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // 2. Reverse second half
        ListNode second = reverse(slow.next);
        slow.next = null; // split the list

        // 3. Merge two halves
        ListNode first = head;

        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
    //Reverse second half
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
