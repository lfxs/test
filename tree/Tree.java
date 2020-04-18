package tree;

public class Tree {
    Node root;
    //根据 key的位置 发现节点node
    public Node find(int key){
        Node current = root;
        while (current != null && current.key != key){
            if(key < current.key){
                current = current.leftChild;
            }else{
                current = current.rightChild;
            }
        }
        return current;
    }
    //key 位置 value 数值
    public void insert(int key,int value){
        //首次在类执行方法的时候 root == null 则首次value则为root节点
        if(root == null){
            root = new Node(key,value);
            return;
        }
        //每次插入都是从根节点开始运行的，判断插入数据和根节点的数值大小
        //决定是在左子树 还是右子树
        Node currentNode = root;
        Node parentNode = root;
        boolean isLeftChild = true;
        while (currentNode != null) {
            //随着节点的移动 父节点也随之移动
            parentNode = currentNode;
            if (key < currentNode.key) {
                currentNode = currentNode.leftChild;
                isLeftChild = true;
            } else {
                currentNode = currentNode.rightChild;
                isLeftChild = false;
            }
        }
        //将本次需要插入的数据封装为节点，挂在对应父节点的下边
        Node newNode = new Node(key, value);
        if (isLeftChild) {
            parentNode.leftChild = newNode;
        } else {
            parentNode.rightChild = newNode;
        }
    }
    //中序遍历  先遍历左子树 根 右子树
    public void inOrder(Node rootNode){
        if(rootNode != null){
            //相当于每一个节点 都会存在 左右子树 递归就是找到叶子节点不存在的
            inOrder(rootNode.leftChild);
            System.out.println(rootNode.key + "," + rootNode.value);
            inOrder(rootNode.rightChild);
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(6, 6);//插入操作,构造图一所示的二叉树
        tree.insert(3, 3);
        tree.insert(4, 4);
        tree.insert(7, 7);
        tree.inOrder(tree.root);

    }
}
