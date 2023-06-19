package Seminars.seminar_1;

import java.util.Date;

// числа Фибоначи ( формула F(n) = F(n-1) + F(n-2) )
public class Task_4A {
    public static void main(String[] args) {
//        System.out.println(F1(50));
        test();
    }

    public static long firstF1(int n) {
        if (n == 1 || n == 2) {   // это условие можно записать иначе n <= 2
            return 1;
        }
        return firstF1(n-1) + firstF1(n-2);
    }
// сложность O(2^n)

// улучшенное решение с использованием массива

    public static long secF1(int n) {
        if (n == 1 || n == 2) {   // это условие можно записать иначе n <= 2
            return 1;
        }

        long[] F = new long[n + 1];
        F[1] = 1;
        F[2] = 1;

        for (int i = 3; i <= n; i++) {
            F[i] = F[i-1] + F[i-2];
        }

        return  F[n];
    }

// сложность O(n)

    // функция тестирования
    public static void test() {
        for (int n = 10; n <= 50; n++) {
            Date start = new Date();
            firstF1(n);
            Date end = new Date();
            long time1 = end.getTime() - start.getTime();


            start = new Date();
            secF1(n);
            end = new Date();
            long time2 = end.getTime() - start.getTime();

            System.out.printf("N = %d, time1 = %d, time2 = %d \n",n, time1, time2 );
        }
    }

}




