public class LinkedList {
    Node head;

    public void addNode(int data){
        Node new_node = new Node(data);
        if(head == null)
            head = new_node;
        else{
            Node itr = head;
            if(data == 30){
                itr = head.next;
                head.next = new_node;
                new_node.next = itr;
            }else {
                while(itr.next != null)
                    itr = itr.next;
                itr.next = new_node;
            }
        }
    }
}
