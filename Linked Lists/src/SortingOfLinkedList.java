class ListssNode {
    int val;
    ListNode next;

    ListssNode(int val) {
        this.val = val;
    }
}

public class SortingOfLinkedList {
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        // Dummy heads for 0s, 1s, 2s
        ListNode zeroD = new ListNode(0);
        ListNode oneD = new ListNode(0);
        ListNode twoD = new ListNode(0);

        // Current pointers for 0s, 1s, 2s
        ListNode zero = zeroD, one = oneD, two = twoD;

        // Traverse and link nodes into respective lists
        ListNode curr = head;
        while (curr != null) {
            if (curr.val == 0) {
                zero.next = curr;
                zero = zero.next;
            } else if (curr.val == 1) {
                one.next = curr;
                one = one.next;
            } else {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }

        // Connect 0s -> 1s -> 2s
        zero.next = (oneD.next != null) ? oneD.next : twoD.next;
        one.next = twoD.next;
        two.next = null;

        // New head is the start of 0s if exists, else 1s, else 2s
        head = zeroD.next != null ? zeroD.next : (oneD.next != null ? oneD.next : twoD.next);
        return head;
    }

    // Print helper
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: 1 -> 2 -> 0 -> 1 -> 2 -> 0
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(0);

        System.out.print("Original: ");
        printList(head);

        head = sortList(head);

        System.out.print("Sorted:   ");
        printList(head);
        // Output: 0 -> 0 -> 1 -> 1 -> 2 -> 2
    }
}
