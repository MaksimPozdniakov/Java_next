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
    }

    private void insert(Node node, int value){
        if (node.value != value) {
            if(node.value < value){
                // вставка вправо
                if (node.right == null){
                    node.right = new Node();
                    node.right.value = value;
                } else {
                    insert(node.right, value);
                }
            }else {
                if (node.left == null) {
                    node.left = new Node();
                    node.left.value = value;
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
}

public class Task_02 {
    public static void main(String[] args) {

    }
}
