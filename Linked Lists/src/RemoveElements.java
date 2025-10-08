public class RemoveElements {

    public static ListNode removeElements(ListNode head, int val) {
        // Step 1: Create dummy node to handle deletion at head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Step 2: Traverse and remove matching nodes
        ListNode current = dummy;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // skip the node with val
            } else {
                current = current.next;
            }
        }

        // Step 3: Return new head (dummy.next)
        return dummy.next;
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        System.out.print("Original List: ");
        printList(head);

        int val = 6;
        head = removeElements(head, val);

        System.out.print("List after removing " + val + ": ");
        printList(head);
    }
}