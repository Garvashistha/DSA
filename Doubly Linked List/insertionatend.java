public class insertionatend {
    private Node head;
    private class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value = value;
        }
    }
    public void insertion(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next !=null){
           temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+"<->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        insertionatend list =new  insertionatend();
        list.insertion(1);
        list.insertion(2);
        list.insertion(3);
        list.insertion(4);
        list.insertion(5);
        list.insertion(6);
        list.display();
        list.insertion(7);
        System.out.println("After insertion:");
        list.display();
    }
}
