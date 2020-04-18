package tree;

public class Node {
    //节点属性  数值 关系 左右
    int key;
    int value;
    Node leftChild;
    Node rightChild;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }

}
