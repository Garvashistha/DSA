public class deletionatend {
    private Node head;
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
        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }
    public void delete(){
        if (head == null) return;  // Empty list
        if (head.next == null) {   // Only one node
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "<->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        deletionatend list = new deletionatend();
        list.insertion(1);
        list.display();
        list.delete();
        System.out.println("After deletion");
        list.display();
    }
    }
