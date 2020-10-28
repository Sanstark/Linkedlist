public class LinkedList {
    Node head;

    public void addNode(int data){
        Node new_node = new Node(data);
        if(head == null)
            head = new_node;
        else{
            Node itr = head;
            while(itr.next != null)
                itr = itr.next;
            itr.next = new_node;
        }
    }
}
