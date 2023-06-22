package Seminars.seminar_3;


// односвязный список

class List{
    static Node head;
    static class Node{   // класс узла
        int value;
        Node next;
    }

    public static void pushFront(int value){     //алгоритм добавления в начало
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    public static void popFront(){           //алгоритм удаления с начала
        // проверяем пустой список или нет
        if (head != null){
            head = head.next;
        }
    }

    public static void print(){     //алгоритм вывода списка
        Node cur = head;
        while (cur != null) {
            System.out.printf("%d ", cur.value);
            cur = cur.next;
        }
        System.out.println();
    }

    public static boolean contains(int value) {    // алгоритм поиска
        Node cur = head;
        while (cur != null) {
            if (cur.value == value) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public static void pushBack(int value){     //алгоритм добавления в конец
        Node node = new Node();
        node.value = value;

        if (head == null) {
            head = node;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    public static void popBack(){           //алгоритм удаления с конца
        // проверяем пустой список или нет
        if (head != null){
            if (head.next == null){
                head = null;
            }else {
                Node cur = head;
                while (cur.next.next != null) {
                    cur = cur.next;
                }
                cur.next = null;
            }
        }
    }
}

public class Task_01 {
    public static void main(String[] args) {
        List list = new List();
        for (int i = 1; i <= 5; i++){
            list.pushFront(i);
        }

        list.print();
        list.popFront();
        list.popFront();

        list.print();

        list.pushBack(7);
        list.print();

        list.popBack();
        list.print();

    }
}
