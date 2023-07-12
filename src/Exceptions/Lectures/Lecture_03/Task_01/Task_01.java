package Exceptions.Lectures.Lecture_03.Task_01;

// переделали предыдущий код с использованием блока try-with-resources

import java.io.FileReader;
import java.io.IOException;

public class Task_01 {
    public static void main(String[] args) {
       String path = "D:\\Java_next\\src\\Exceptions\\HomeWorks\\" +
               "HomeWork_01\\Task_03\\database1.txt";
       String path2 = "test";

        FileNotFoundExceptionTest(path2);
    }

    public static void FileNotFoundExceptionTest(String path){
        try(FileReader test2 = new FileReader(path)) {
            System.out.println(test2.read());
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
    }
}
