package Seminars.seminar_4;

// реализуем бинарное дерево поиска
class Tree{
    Node root;

    class Node{
        int value;
        Node left;
        Node right;
    }

    public void insert(int value){
        if(root == null){
            root = new Node();
            root.value = value;
        }else {
            insert(root, value);
        }
        // root.color = BLACK;
    }

    private void insert(Node node, int value){
        if (node.value != value) {
            if(node.value < value){
                // вставка вправо
                if (node.right == null){
                    node.right = new Node();
                    node.right.value = value;
                    // node.right.color = RED;
                } else {
                    insert(node.right, value);
                }
            }else {
                if (node.left == null) {
                    node.left = new Node();
                    node.left.value = value;
                    // node.left.color = RED;
                }else {
                    insert(node.left, value);
                }
            }
        }
    }

    public Node find(int value) {
        return find(root, value);
    }

    private Node find(Node node, int value){
        if(node == null){
            return null;
        }
        if (node.value == value){
            return node;
        }
        if (node.value < value){
            return find(node.right, value);
        } else {
            return find(node.left, value);
        }
    }

    public void printInorder() {
        printInorder(root);
        System.out.println();
    }

    private void printInorder(Node node) {
        if (node == null) {
            return;
        }

        printInorder(node.left);
        System.out.print(node.value + " ");
        printInorder(node.right);
    }
}

public class Task_02 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        for (int i = 1; i < 5; i++) {
            tree.insert(i);
        }

        tree.printInorder();  // Выведет дерево в инфиксном порядке
    }

}
