package Seminars.seminar_4;

class HashMap {
    class Entity {
        int key;
        int value;
    }

    class Basket {    // корзина
        Node head;
        class Node{
            Entity entity;
            Node next;
        }

        private boolean push(Entity entity) {
            Node node = new Node();
            node.entity = entity;
            if (head == null) {
                head = node;
            } else {
                Node cur = head;
                while (cur != null) {
                    if(cur.entity.key == entity.key) {
                        return false;
                    }
                    if (cur.next == null){
                        cur.next = node;
                        return true;
                    }
                    cur = cur.next;
                }
            }
            return true;
        }

        private Integer find(int key) {
            Node cur = head;
            while (cur != null) {
                if (cur.entity.key == key) {
                    return cur.entity.value;
                }
                cur = cur.next;
            }
            return null;
        }

        private boolean remove(int key) {
            if (head != null) {
                if (head.entity.key == key){
                    head = head.next;
                    return true;
                } else {
                    Node cur = head;
                    while (cur.next != null) {
                        if(cur.next.entity.key == key) {
                            cur.next = cur.next.next;
                            return true;
                        }
                        cur = cur.next;
                    }
                }
            }
            return false;
        }
    }


    static final int INIT_SIZE = 16;  // фиксированный размер наших HashMap

    Basket[] baskets;   // массив из наших корзинок

    public HashMap(){
        this(INIT_SIZE);
    }

    public HashMap(int size) {
        baskets = new Basket[size];
    }

    private int getIndex(int key){
        return key % baskets.length;    // получаем число из отрезка - [0, length - 1]
        // key = 22, getIndex(22) = 22 % 16 = 6 - это и есть наш индекс
    }

    public boolean push(int key, int value) {
        int index = getIndex(key);
        Basket basket = baskets[index];
        if (basket == null) {
            basket = new Basket();
            baskets[index] = basket;
        }
        Entity entity = new Entity();
        entity.key = key;
        entity.value = value;
        return basket.push(entity);
    }

    public Integer find(int key) {
        int index = getIndex(key);
        Basket basket = baskets[index];
        if (basket != null) {
            return basket.find(key);
        }
        return null;
    }

    public boolean remove(int key) {
        int index = getIndex(key);
        Basket basket = baskets[index];
        if (basket != null) {
            return basket.remove(key);
        }
        return false;
    }
}

public class Task_01 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.push(1,2);
        map.push(17,3);
        map.push(3,4);

        System.out.println(map.find(1));
        System.out.println(map.find(3));
        System.out.println(map.find(17));
        System.out.println(map.find(5));

        map.remove(17);
        System.out.println(map.find(17));
    }
}
