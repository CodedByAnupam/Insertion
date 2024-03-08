public class Linked {
    Node head;

    public static void main(String[] args) {
        Linked newList = new Linked();
        newList.insertAtBeginning(4);
    }
    public void insertAtBeginning(int newData){
        Node newNode = new Node(newData);
        newNode.setNext(head);
        head = newNode;
    }

}


