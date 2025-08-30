public class insertionAtGiven {
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
        public void insert(int index , int val){
            Node node = new Node(val);
            if(index<=0){
               System.out.println("Invalid position");
               return;
            }
            if(index == 1){
                node.next = head;
                if(head!=null){
                    head.prev = node;
                }
                head = node;
                return;
            }
            Node temp = head;
            int count = 1;
            while(temp!=null && count<index-1){
                temp = temp.next;
                count++;
            }
            if(temp == null){
                System.out.println("index out of bounds");
                return;
            }
            node.next = temp.next;
            node.prev = temp;
            if(temp.next!=null){
                temp.next.prev = node;
            }
            temp.next = node;
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
            insertionAtGiven list =new insertionAtGiven();
            list.insertion(1);
            list.insertion(2);
            list.insertion(3);
            list.insertion(4);
            list.insertion(5);
            list.insertion(6);
            list.display();
            list.insert(1,55);
            System.out.println("After insertion:");
            list.display();
        }
    }

