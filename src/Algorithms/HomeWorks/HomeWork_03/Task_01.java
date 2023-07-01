package Algorithms.HomeWorks.HomeWork_03;

class List {
    static Node head;

    static class Node {   // класс узла
        int value;
        Node next;
    }

    public static void pushFront(int value) {     //алгоритм добавления в начало
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    public static void print(){     //алгоритм вывода списка
        Node cur = head;
        while (cur != null) {
            System.out.printf("%d ", cur.value);
            cur = cur.next;
        }
        System.out.println();
    }

    public static void reverse() {
        Node prevNode = null;
        Node currNode = head;
        Node nextNode = null;

        while (currNode != null) {
            nextNode = currNode.next; // сохраняем ссылку на следующий узел
            currNode.next = prevNode; // изменяем ссылку на предыдущий узел
            prevNode = currNode; // сохраняем текущий узел как предыдущий для следующей итерации
            currNode = nextNode; // переходим к следующему узлу
        }

        head = prevNode; // обновляем головной узел
    }

}

public class Task_01 {
    public static void main(String[] args) {
        List list = new List();
        for (int i = 1; i <= 5; i++){
            list.pushFront(i);
        }

        list.reverse(); // вызываем метод разворота
        list.print();
    }
}
