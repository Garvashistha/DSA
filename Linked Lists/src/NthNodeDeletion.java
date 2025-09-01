class ListtNode {
    int val;
    ListNode next;
    ListtNode(int val) { this.val = val; }
}

public class NthNodeDeletion {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // Dummy node before head (helps in case we remove the first node)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast ahead by n+1 steps so gap between slow and fast is n
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Slow is just before the node to delete
        slow.next = slow.next.next;

        return dummy.next; // new head
    }

    // Helper: print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original: ");
        printList(head);

        head = removeNthFromEnd(head, 2);

        System.out.print("After removal: ");
        printList(head);

    }
}
