public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head){
    ListNode current = head;

        while (current != null && current.next != null) {
        if (current.val == current.next.val) {
            // skip the duplicate node
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }

        return head;
}

// Helper method to print the list
public static void printList(ListNode head) {
    while (head != null) {
        System.out.print(head.val);
        if (head.next != null) System.out.print(" -> ");
        head = head.next;
    }
    System.out.println();
}

}
