// Complete Java Program to Reverse a Linked List

class ListNodeee {
    int val;
    ListNodeee next;

    // constructor
    ListNodeee(int val) {
        this.val = val;
        this.next = null;
    }
}

public class reversesinglylinkedlist {

    // function to reverse linked list iteratively
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // save next
            curr.next = prev;          // reverse link
            prev = curr;               // move prev
            curr = next;               // move curr
        }
        return prev; // new head
    }

    // helper function to print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        // reverse it
        ListNode reversedHead = reverseList(head);

        System.out.println("Reversed Linked List:");
        printList(reversedHead);
    }
}
