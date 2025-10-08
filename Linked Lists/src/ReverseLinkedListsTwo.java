public class ReverseLinkedListsTwo{
public static ListNode reverseBetween(ListNode head, int left, int right) {
    if (head == null || left == right) return head;

    // Step 1: Create a dummy node
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    // Step 2: Move 'prev' to the node before 'left'
    ListNode prev = dummy;
    for (int i = 1; i < left; i++) {
        prev = prev.next;
    }

    // Step 3: Start reversing between left and right
    ListNode current = prev.next;
    ListNode next = null;
    ListNode lastUnreversed = prev;
    ListNode sublistTail = current; // will become the tail of the reversed part

    for (int i = 0; i < right - left + 1; i++) {
        next = current.next;
        current.next = prev.next;
        prev.next = current;
        current = next;
    }

    // Step 4: Fix connections
    sublistTail.next = current;  // connect end of reversed sublist to remainder
    lastUnreversed.next = prev.next; // connect start part to reversed section

    return dummy.next;
}

// Helper to print linked list
public static void printList(ListNode head) {
    while (head != null) {
        System.out.print(head.val);
        if (head.next != null) System.out.print(" -> ");
        head = head.next;
    }
    System.out.println();
}

public static void main(String[] args) {
    // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    System.out.print("Original List: ");
    printList(head);

    int left = 2, right = 4;

    ListNode newHead = reverseBetween(head, left, right);

    System.out.print("After Reversing from " + left + " to " + right + ": ");
    printList(newHead);
}
}