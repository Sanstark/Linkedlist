public class LinkedList {
    Node head;

    public void addNode(int data){
        Node new_node = new Node(data);
        if(head == null)
            head = new_node;
        else{
            new_node.next = head;
            head = new_node;
        }
    }
}
