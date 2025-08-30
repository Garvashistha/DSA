public class deletionatbeg {
    private Node head;
    private class Node{
        int value;
        Node prev;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public void insertion(int val){
        Node node = new Node(val);
            if(head==null){
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
        if(head == null) return;
        if(head.next == null){
            head = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
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
        deletionatbeg list = new deletionatbeg();
        list.insertion(1);
        list.insertion(2);
        list.insertion(3);
        list.insertion(4);
        list.insertion(5);
        list.insertion(6);
        list.insertion(7);
        list.display();
        list.delete();
        System.out.println("After deletion");
        list.display();
    }
    }
