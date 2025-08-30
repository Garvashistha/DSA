public class insertionatgiven {
    private Node head;

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void insert(int val) {
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
    }

    public void insertion(int val,int index) {
        Node node = new Node(val);
        Node temp = head;
        int count = 0;
        while(temp!=null && count<index-1){
            temp = temp.next;
            count++;
        }
        if(temp == null){
            System.out.println("itne elements hi nahin hain chutiye");
            return;
        }
        node.next = temp.next;
        temp.next  = node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        insertionatgiven list = new insertionatgiven();

        // Create list with elements [1, 2, 3, 4, 5]
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.display();
        list.insertion(99,3);
        System.out.println("After insertion");
        list.display();
    }
}
