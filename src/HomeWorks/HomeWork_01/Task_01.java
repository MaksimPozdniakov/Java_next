package HomeWorks.HomeWork_01;

import java.util.Arrays;

public class Task_01 {
    public static void main(String[] args) {
        int[] arr = {100,25,12,45,78,98,65,32,5};

        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {
        // длина нашего массива
        int n = arr.length;

        // Построение кучи (перегруппируем массив)
        for (int i = n/2 - 1; i >= 0 ; i--) {
            heapify(arr, i, n);
        }
        // Один за другим извлекаем элементы из кучи
        for (int i = n-1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, 0, i);
        }
    }

    private static void heapify(int[] arr, int i, int n) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2 * i + 1; // левый = 2*i + 1
        int r = 2 * i + 2; // правый = 2*i + 2

        // Если левый дочерний элемент больше корня
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // Если самый большой элемент не корень
        if (i != largest) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, largest, n);
        }
    }
}