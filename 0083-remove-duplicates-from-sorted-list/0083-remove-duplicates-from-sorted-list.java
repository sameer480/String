class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;

        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null) {
            if (prev.val == curr.val) {
                prev.next = curr.next; // duplicate skip
            } else {
                prev = curr;           // move prev only when values differ
            }
            curr = curr.next; 
        }

        return head;
    }
}
