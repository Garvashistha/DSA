public class deletefirst {
        private Node head;
        private class Node{
            int value;
            Node next;
            Node(int value){
                this.value = value;
            }
        }
        public void insert(int val){
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
        }
        public void delete(){
            if(head == null){
                return;
            }
            head = head.next;
        }
        public void display() {
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.value+"->");
                temp = temp.next;
            }
        }
        public static void main(String[] args) {
            deletefirst list = new deletefirst();

            // Create list with elements [1, 2, 3, 4, 5]
            list.insert(1);
            list.insert(2);
            list.insert(3);
            list.insert(4);
            list.insert(5);

            list.display();
            list.delete();
            System.out.println("after deleting first node: ");
            list.display();
            // Output: 1 -> 2 -> 3 -> 4 -> 5 -> END
        }
    }




