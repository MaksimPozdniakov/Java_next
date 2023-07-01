package Algorithms.Seminars.seminar_1;

//сумма простых чисел
public class Task_1 {

    public static int Sum(int N) {
        int res = 0;                        // O(1)
        for (int i = 1; i <= N; i++) {      // O(N)
            res += i;                       // O(1)
        }
        return res;                         // O(1)
    }

    public static void main(String[] args) {
        System.out.println(Sum(10));
    }

//    оценка сложности                      // O(Sum(N) = O(1) + O(N) * O(1) + O(1) = O(N +2) = O(N)
}
