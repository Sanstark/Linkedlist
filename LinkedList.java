public class LinkedList {
    Node head, tail;

    public void addNode(int data) {
        Node new_node = new Node(data);
        if (this.head == null) {
            this.head = new_node;
            this.tail = new_node;
        }
        else{
            this.tail.next = new_node;
            this.tail = new_node;
        }
    }

    public void pop(){
        if(this.head == null)
            System.out.println("Linked List is Empty.");
        else if(this.head != this.tail)
            this.head = this.head.next;
        else {
            this.head = null;
            this.tail = null;
        }
    }

    public void popLast(){
        if(this.head == null)
            System.out.println("List is Empty.");
        else if(this.head != this.tail) {
            Node itr = head;
            while(itr.next != this.tail)
                itr =itr.next;
            this.tail = itr;
        }else{
            this.head = this.tail = null;
        }
    }

    public Node searchNode(int data){
        if(this.head == null) {
            System.out.println("List is empty");
            return null;
        }
        else{
            Node itr = this.head;
            while(itr.data != data)
                itr = itr.next;
            return itr;
        }
    }

    public boolean insertNode(int addData, int searchData){
        Node node = new Node(addData);
        Node searched = searchNode(searchData);
        if(searched == null) {
            System.out.println("Node with value " + searchData + " doesn't exist");
            return false;
        }else if(searched.next == null) {
            searched.next = node;
            return true;
        }else{
            Node temp = searched.next;
            searched.next = node;
            node.next = temp;
            return true;
        }
    }
}
