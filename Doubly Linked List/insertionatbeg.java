public class insertionatbeg {
    Node head;
    private class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value = value;
        }
    }
    public void insertion(int val) {

        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
    }
    public void insert(int val){
        Node node = new Node(val);
        node.next = head;
        if(head!=null) {
            head.prev = node;
        }
        head = node;
    }
    public void display() {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"<->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        insertionatbeg list = new insertionatbeg();

        // Create list with elements [1, 2, 3, 4, 5]
        list.insertion(1);
        list.insertion(2);
        list.insertion(3);
        list.insertion(4);
        list.insertion(5);

        list.display();
        list.insert(6);
        System.out.println("AFter insertion");
        list.display();
        // Output: 1 -> 2 -> 3 -> 4 -> 5 -> END
    }
    }
