public class deletionAtGiven {
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
        public void delete(int index){
            if (index == 1){
                head = head.next;
                if(head!=null){
                    head.prev = null;
                }
                return;
            }
            Node temp = head;
            int count = 1;
            if(temp == null || temp.next == null){
                System.out.println("Index out of bounds");
                return;
            }
            Node toDelete = temp.next;
            temp.next = toDelete.next;

            if (toDelete.next != null) {
                toDelete.next.prev = temp;
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
            deletionAtGiven list = new deletionAtGiven();
            list.insertion(1);
            list.insertion(2);
            list.insertion(3);
            list.insertion(4);
            list.insertion(5);
            list.insertion(6);
            list.display();
            list.delete(1);
            System.out.println("After deletion");
            list.display();
        }
    }