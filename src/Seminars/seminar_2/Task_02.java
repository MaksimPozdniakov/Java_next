package Seminars.seminar_2;


// сортировка слиянием
public class Task_02 {

    static final int[] buf = new int[100000];

    public static void MergeSort(int[] Array) {
        MergeSort(Array,0,Array.length-1);
    }

    private static void MergeSort(int[] Array, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;
        MergeSort(Array, left, mid);
        MergeSort(Array, mid+1, right);

        // алгоритм слияния
        int i = left, j = mid + 1, k = left;

        while (i <= mid) {
            buf[k] = Array[i];
            i++;
            k++;
        }

        while (j <= right) {
            buf[k] = Array[j];
            j++;
            k++;
        }

        for (int q = left; q < right; q++) {
            Array[q] = buf[q];
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

        MergeSort(Array);

        for (int item: Array)
            System.out.printf("%d ", item);
        System.out.println();
    }

    

}
