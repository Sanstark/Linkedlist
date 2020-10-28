public class LinkedList {
    Node head, tail;

    public void addNode(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            tail = new_node;
        }
        else{
            tail.next = new_node;
            tail = new_node;
        }
    }

    public void pop(){
        if(head == null)
            System.out.println("Linked List is Empty.");
        else if(head != tail)
            head = head.next;
        else {
            head = null;
            tail = null;
        }
    }

    public void popLast(){
        if(head == null)
            System.out.println("List is Empty.");
        else if(head != tail) {
            Node itr = head;
            while(itr.next != tail)
                itr =itr.next;
            tail = itr;
        }else{
            head = tail = null;
        }
    }
}
