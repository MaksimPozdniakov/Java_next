package Exceptions.Lectures.Lecture_01;

public class Task_02 {
    public static void main(String[] args) {
        System.out.println(divide(10,0));
    }

    public static int divide(int a1, int a2) {

        if (a2 == 0) {
            throw new RuntimeException("Devide by zero not permited");
        }

        return a1/a2;
    }
}
