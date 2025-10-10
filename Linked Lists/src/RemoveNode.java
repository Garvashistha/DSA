public class RemoveNode {
    public static void deleteNode(ListNode node) {
        // Copy value from next node into current node
        node.val = node.next.val;
        // Bypass the next node
        node.next = node.next.next;
    }

    // Helper function to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create linked list: 4 -> 5 -> 1 -> 9
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.print("Original List: ");
        printList(head);

        // Let's say we need to delete node with value 5
        ListNode nodeToDelete = head.next; // node with val = 5
        deleteNode(nodeToDelete);

        System.out.print("After Deleting 5: ");
        printList(head);
    }
}