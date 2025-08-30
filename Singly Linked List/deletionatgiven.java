public class deletionatgiven {
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

        public void deletion(int index) {
            if(head == null){
                head = head.next;
                return;
            }
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
            if(temp == null || temp.next == null){
                System.out.println("index out of bounds");
                return;
            }
            temp.next = temp.next.next;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
        }

        public static void main(String[] args) {
            deletionatgiven list = new deletionatgiven();

            // Create list with elements [1, 2, 3, 4, 5]
            list.insert(1);
            list.insert(2);
            list.insert(3);
            list.insert(4);
            list.insert(5);
            list.display();
            list.deletion(4);
            System.out.println("After deletion");
            list.display();
        }
    }

