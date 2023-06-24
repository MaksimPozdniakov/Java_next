package HomeWorks.HomeWork_04;

class Tree {
    Node root;

    enum Color {
        RED, BLACK
    }

    class Node {
        int value;
        Node left;
        Node right;
        Color color;

        Node(int value, Color color) {
            this.value = value;
            this.color = color;
        }
    }

    private Node rotateLeft(Node node) {
        Node newRoot = node.right;
        node.right = newRoot.left;
        newRoot.left = node;
        newRoot.color = node.color;
        node.color = Color.RED;
        return newRoot;
    }

    private Node rotateRight(Node node) {
        Node newRoot = node.left;
        node.left = newRoot.right;
        newRoot.right = node;
        newRoot.color = node.color;
        node.color = Color.RED;
        return newRoot;
    }

    private void flipColors(Node node) {
        node.color = Color.RED;
        node.left.color = Color.BLACK;
        node.right.color = Color.BLACK;
    }

    public void insert(int value) {
        root = insert(root, value);
        root.color = Color.BLACK;
    }

    private Node insert(Node node, int value) {
        if (node == null)
            return new Node(value, Color.RED);

        if (value < node.value)
            node.left = insert(node.left, value);
        else if (value > node.value)
            node.right = insert(node.right, value);
        else
            return node;

        if (
                node.right != null && node.right.color == Color.RED &&
                        (node.left == null || node.left.color == Color.BLACK)
        )
            node = rotateLeft(node);

        if (
                node.left != null && node.left.color == Color.RED &&
                        node.left.left != null && node.left.left.color == Color.RED
        )
            node = rotateRight(node);

        if (
                node.left != null && node.left.color == Color.RED &&
                        node.right != null && node.right.color == Color.RED
        )
            flipColors(node);

        return node;
    }

    public void printPreorder() {
        System.out.println("Дерево в префиксном порядке:");
        printPreorder(root);
        System.out.println();
    }

    private void printPreorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + "(" + (node.color == Color.RED ? "R" : "B") + ") ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public void printInorder() {
        System.out.println("Дерево в инфиксном порядке:");
        printInorder(root);
        System.out.println();
    }

    private void printInorder(Node node) {
        if (node == null) {
            return;
        }

        printInorder(node.left);
        System.out.print(node.value + "(" + (node.color == Color.RED ? "R" : "B") + ") ");
        printInorder(node.right);
    }

    public void printPostorder() {
        System.out.println("Дерево в постфиксном порядке:");
        printPostorder(root);
        System.out.println();
    }

    private void printPostorder(Node node) {
        if (node == null) {
            return;
        }

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.value + "(" + (node.color == Color.RED ? "R" : "B") + ") ");
    }

}

public class Task_01 {

    public static void main(String[] args) {
        Tree tree = new Tree();
        for (int i = 1; i < 5; i++) {
            tree.insert(i);
        }

        tree.printPreorder(); // Выведет дерево в префиксном порядке
        tree.printInorder();  // Выведет дерево в инфиксном порядке
        tree.printPostorder(); // Выведет дерево в постфиксном порядке

    }
}
