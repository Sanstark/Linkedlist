public class LinkedListMain {
    LinkedList list;
    public LinkedListMain(){
        list = new LinkedList();
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Linked List Program");

        LinkedListMain llmain = new LinkedListMain();
        llmain.list.addNode(56);
        llmain.list.addNode(30);
        llmain.list.addNode(70);

        //linkedList.pop();
        //llmain.list.popLast();
        llmain.list.insertNode(40,30);

        llmain.list.deleteNode(40);
        System.out.println("Size of the list is : " + llmain.list.showSize());
    }
}
