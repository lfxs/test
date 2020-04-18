package line;

public class Line {
    Node head;
    public void addData(int data){
        //初始化头结点
        if(head==null){
            Node node = new Node(data);
            node.lastNode = head;
            head = node;
            return;
        }
        Node newNode = new Node(data);
        Node current  = head;
        Node previous = head;
        while (current != null) {
            previous = current;
            current = current.lastNode;
        }
        previous.lastNode = newNode;
    }

    public static void main(String[] args) {
        Line line = new Line();
        line.addData(3);
        line.addData(4);
        System.out.println(line.head.data);
        System.out.println(line.head.lastNode.data);
    }
}
