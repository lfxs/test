package line;

public class Node {
    int data;
    Node lastNode;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node lastNode) {
        this.data = data;
        this.lastNode = lastNode;
    }
}
