package Seminars.seminar_3;



// сортировка списка
class sList{
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

    public static void sort(){
        boolean needSort = true;
        do{
            needSort = false;
            Node node = head;
            while (node != null && node.next != null){
                if (node.value > node.next.value){
                    Node before = node.prev;
                    Node cur = node;
                    Node next = node.next;
                    Node after = next.next;

                    // начинаем делать обмен ссылок
                    cur.next = after;
                    cur.prev = next;
                    next.next = cur;
                    next.prev = before;


                    // менем ссылки у before и after
                    if (before != null) {
                        before.next = next;
                    }else {
                        head = next;
                    }

                    if (after != null) {
                        after.prev = cur;
                    } else {
                        tail = cur;
                    }

                    needSort = true;

                }
                node = node.next;
            }

        }while (needSort);
    }

}


public class Task_03 {
    public static void main(String[] args) {
       sList list = new sList();
        for (int i = 1; i <= 15; i++){
            list.pushFront(i);
        }

        list.sort();

        list.print();


    }
}