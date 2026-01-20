//This is the problem of leetcode 234

class Solution {
    public boolean isPalindrome(ListNode head) {
       if(head ==null|| head.next == null) return true;
       //Find Middle
       ListNode slow = head;
       ListNode fast = head;

       while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
       }
       
       // Reverse secondhalf
       ListNode secondhalf = Reverse(slow);
       ListNode firsthalf = head;
       //Compare
       while(secondhalf!=null){
        if(firsthalf.val!=secondhalf.val){
            return false;
        }
        firsthalf = firsthalf.next;
        secondhalf = secondhalf.next;
       }
       return true; 
    }
    private ListNode Reverse(ListNode head){
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
