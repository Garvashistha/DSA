class Node{
    int value;
    Node next;
    Node prev;
    Node(int value){
        this.value = value;
    }
}
public class reversal {
    public static Node reverse(Node head){
        Node temp = null;
        Node current = head;
        while(current!=null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if(temp!=null){
            head = temp.prev;
        }
        return head;
    }
    public static void printlist(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;

        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

        System.out.println("Original List:");
        printlist(head);
        head = reverse(head);
        System.out.println("Reversed List:");
        printlist(head);
    }
}
