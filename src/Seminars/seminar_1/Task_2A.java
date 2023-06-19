package Seminars.seminar_1;

public class Task_2A {

    public static void main(String[] args) {
        System.out.println(count(4));
    }

    public static int count(int faces) {
        int count = 0;
        for (int i = 1; i <= faces; i++) {

            for (int j = 1; j <= faces; j++) {

                for (int k = 1; k <= faces; k++) {

                    for (int l = 1; l <= faces; l++) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
