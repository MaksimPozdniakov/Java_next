package Algorithms.Seminars.seminar_1;


// задача про игральные кубики
public class Task_3 {

    public static int Cubs(int K, int N) {
        return Cubs(K,N,1);
    }

    private static int Cubs(int K, int N, int H) {
        if (H == K+1) {
            return 1;
        }

        int res = 0;
        for (int g = 1; g <= N; g++) {
            res += Cubs(K,N,H+1);
        }
        return res;
    }
//    сложность O(n^K)
//    улучшенный вариант решения (более быстрый)



    public static void main(String[] args) {
        System.out.println(Cubs(4,6));
    }
}
