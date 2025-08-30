public class singly {
    private Node head;
    private Node tail;
    private int size;

    public singly() {
        this.size = 0;
    }

    public void insertionfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertionlast(int val) {
        if (tail != null) {
            insertionfirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertionfirst(val);
            return;
        }
        if (index == size) {
            insertionlast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deletefirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }
    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
            System.out.print("END");
        }
        private class Node{
            private int value;
            private Node next;
            public Node(int value){
                this.value = value;
        }
        public Node(int value,Node next){
                this.value = value;
                this.next = next;
        }
    }
    public static void main(String[] args) {
        singly list = new singly();
        list.insertionfirst(3);
        list.insertionfirst(2);
        list.insertionfirst(5);
        list.insertionfirst(7);
        list.insertionlast(4);
        list.insert(43,3);
        list.deletefirst();
        list.display();
    }
}