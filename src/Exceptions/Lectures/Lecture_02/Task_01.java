package Exceptions.Lectures.Lecture_02;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class Task_01 {
    public static void main(String[] args) {
//        ClassCastExceptionTest();
//        NumberFormatExceptionTest();
        UnsupportedOperationExceptionTest();
    }

    public static void ClassCastExceptionTest(){
        Object object = new String("123");
        File file = (File) object;
        System.out.println(file);
    }

    public static void NumberFormatExceptionTest(){
        String number = "123fq";
        int result = Integer.parseInt(number);
        System.out.println(result);
    }

    public static void UnsupportedOperationExceptionTest(){
        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object());
    }
}
