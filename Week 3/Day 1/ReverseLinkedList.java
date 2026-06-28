class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next; // save next
            curr.next = prev; // reverse link
            prev = curr; // move prev up
            curr = nextNode; // move to next
        }
        return prev;
    }
    static class ListNode {
        int val; ListNode next;
        ListNode(int x) { val = x; next = null; }
    }
}