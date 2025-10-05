public class Cycledetection {
    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {  // meeting point means cycle exists
                return true;
            }
        }

        return false;  // reached end → no cycle
    }

    public static void main(String[] args) {
        // Creating linked list: 1 → 2 → 3 → 4 → 5 → (back to 3)
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create a cycle: last node (5) points back to node (3)
        head.next.next.next.next.next = head.next.next;

        boolean result = hasCycle(head);
        System.out.println("Cycle detected? " + result);  // Output: true
    }
}
