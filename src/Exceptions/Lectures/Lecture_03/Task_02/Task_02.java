package Exceptions.Lectures.Lecture_03.Task_02;

// копирование одного файла в другой используя try-with-resources

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task_02 {
    public static void main(String[] args) {
        String path = "D:\\Java_next\\src\\Exceptions\\HomeWorks\\" +
                "HomeWork_01\\Task_03\\database1.txt";
        String path2 = "test";

        FileNotFoundExceptionTest(path);
    }

    public static void FileNotFoundExceptionTest(String path){
        try (FileReader reader = new FileReader(path);
            FileWriter writer = new FileWriter("D:\\Java_next\\src\\Exceptions\\Lectures\\Lecture_03\\" +
                    "Task_02\\newFile.txt")) {
            while (reader.ready()) {
                writer.write(reader.read());
            }

        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }

        System.out.println("copy successfully");
    }
}
