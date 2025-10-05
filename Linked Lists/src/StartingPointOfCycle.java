public class StartingPointOfCycle {
    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        // Step 2: Find cycle start
        if (hasCycle) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow; // start of cycle
        }

        return null; // no cycle
    }

    public static void main(String[] args) {
        // Creating linked list: 1 → 2 → 3 → 4 → 5 → (back to 3)
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create a cycle: node 5 points back to node 3
        head.next.next.next.next.next = head.next.next;

        ListNode startNode = detectCycle(head);

        if (startNode != null)
            System.out.println("Cycle starts at node: " + startNode.val);
        else
            System.out.println("No cycle detected.");
        // Output: Cycle starts at node: 3
    }
}