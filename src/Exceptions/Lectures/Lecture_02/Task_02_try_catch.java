package Exceptions.Lectures.Lecture_02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task_02_try_catch {
    public static void main(String[] args) {
//        int number = 1;
//        try {
//            number = 10 / 0;
//            String test = null;
//            System.out.println(test.length());

//        } catch (ArithmeticException e) {
//            System.out.println("На ноль делить нельзя!");
//        } catch (NullPointerException e) {
//            System.out.println("nullpointer exception");
//        } catch (RuntimeException e) {
//            throw new RuntimeException(e);
//        } // либо можно сразу написать для всех видов exception - catch (Exception e)
//        System.out.println(number);


        FileNotFoundExceptionTest();


    }

    public static void FileNotFoundExceptionTest(){
        FileReader test2 = null;

        try {
//            test2 = new FileReader("C:\\Users\\PMPav\\OneDrive\\Рабочий стол\\" +
//                    "Second block of study\\Seminars\\Java_next\\src\\Exceptions\\HomeWorks\\HomeWork_01\\" +
//                    "Task_03\\database1.txt");
            test2 = new FileReader("test");
            test2.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if (test2 != null) {
                try {
                    test2.close();
                } catch (IOException e){
                    System.out.println("exception while close");
                }
            }
            System.out.println("finally finished");
        }
    }
}
