public class RemoveDuplicatesTwo {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        // Dummy node before head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy; // last node before duplicates
        ListNode current = head;

        while (current != null) {
            // Detect duplicates
            boolean isDuplicate = false;
            while (current.next != null && current.val == current.next.val) {
                isDuplicate = true;
                current = current.next; // skip duplicates
            }

            if (isDuplicate) {
                // Skip the entire duplicate block
                prev.next = current.next;
            } else {
                // Move prev only if current was unique
                prev = prev.next;
            }

            current = current.next; // move to next
        }

        return dummy.next;
    }

    // Helper method to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
}
