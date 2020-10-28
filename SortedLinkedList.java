public class SortedLinkedList {
    static Node node;

    public static void sortAndAdd(int data, Node head){
        node = new Node(data);
        Node n = head;
        while(n.next != null && node.data > n.next.data)
            n = n.next;
        node.next = n.next;
        n.next = node;
    }
}
