
class ListsNode {
    int val;
    ListNode next;

    ListsNode(int val) {
        this.val = val;
    }
}

public class OddEven{
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode odd = head;           // points to odd index nodes
        ListNode even = head.next;     // points to even index nodes
        ListNode evenHead = even;      // save head of even list to attach later

        while (even != null && even.next != null) {
            odd.next = even.next;      // link odd to next odd
            odd = odd.next;            // move odd pointer forward

            even.next = odd.next;      // link even to next even
            even = even.next;          // move even pointer forward
        }

        odd.next = evenHead;           // attach even list at the end of odd list
        return head;
    }

    // Helper to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original: ");
        printList(head);

        head = oddEvenList(head);

        System.out.print("Rearranged: ");
        printList(head);
        // Output: 1 -> 3 -> 5 -> 2 -> 4
    }
}
