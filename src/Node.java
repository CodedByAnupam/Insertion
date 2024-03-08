public class Node {

    private int num;
    private Node next;

    public Node(int num) {
        this.num = num;
        this.next = null;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

