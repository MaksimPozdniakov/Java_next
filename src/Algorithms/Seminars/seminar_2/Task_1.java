package Algorithms.Seminars.seminar_2;

// Шейкерная сортировка
public class Task_1 {

    public static void ShakeSort(int[] Array) {
        for (int i = 0; i < Array.length/2; i++) {
            for (int j = i; j < Array.length - i - 1; j++) {
                if (Array[j] > Array[j+1]) {
                    int temp = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = temp;
                }
            }

            for (int j = Array.length - i -1; j > i; j--) {
                if (Array[j - 1] > Array[j]) {
                    int temp = Array[j - 1];
                    Array[j - 1] = Array[j];
                    Array[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int n = 10;
        int[] Array = new int[n];
        for (int i = 0; i < n; i++) {
            Array[i] = (int)(Math.random() * 100);  // альтернативный вариант заполнения массива рандомно
        }

        for (int item: Array)
            System.out.printf("%d ", item);
        System.out.println();

        ShakeSort(Array);

        for (int item: Array)
            System.out.printf("%d ", item);
        System.out.println();
    }
}
