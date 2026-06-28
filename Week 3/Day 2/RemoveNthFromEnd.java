class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0), slow = dummy, fast = dummy;
        dummy.next = head;
        // Move fast ahead by n+1
        for (int i = 0; i <= n; i++) fast = fast.next;
        // Move both until fast hits end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // Remove the next node
        slow.next = slow.next.next;
        return dummy.next;
    }
    static class ListNode { 
        int val; 
        ListNode next; 
        ListNode(int x){ val = x; } 
    }
}