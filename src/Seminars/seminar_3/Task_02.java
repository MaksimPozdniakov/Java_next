package Seminars.seminar_3;


// двусвязный список
class dList{
    static Node head;
    static Node tail;
    static class Node{   // класс узла
        int value;
        Node next; // ссылка на следующий
        Node prev; // ссылка на предыдущий
    }

    public static void pushFront(int value){     //алгоритм добавления в начало
        Node node = new Node();
        node.value = value;

        if (head == null){
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
        }
        head = node;
    }

    public static void popFront(){           //алгоритм удаления с начала
        // проверяем пустой список или нет
        if (head != null){
            if (head.next == null) {
                head = null;
                tail = null;
            }else {
                head = head.next;
                head.prev = null;
            }
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

        if (tail == null){
            head = node;
        } else {
            node.prev = tail;
            tail.next = node;
        }
        tail = node;
    }

    public static void popBack(){           //алгоритм удаления с конца
        // проверяем пустой список или нет
        if (head != null){
            if (tail.prev == null) {
                head = null;
                tail = null;
            }else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }
}


public class Task_02 {
    public static void main(String[] args) {

    }
}
