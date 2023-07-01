package Exceptions.HomeWorks.HomeWork_01.Task_03;

//Чтение файла и подсчет суммы чисел
//Напишите программу, которая считывает содержимое текстового файла, в котором каждая строка содержит одно число.
//Программа должна подсчитать сумму всех чисел в файле. Если встретится строка, которая не может быть
//преобразована в число, выбросите исключение NumberFormatException
//с сообщением "Некорректное значение числа в файле".

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_03 {

    public static void main(String[] args) throws FileNotFoundException {
//  Файл, где в каждой строке есть числа
//        ArrayList<String> ourStrings = readFile("C:\\Users\\PMPav\\OneDrive\\Рабочий стол\\" +
//                "Second block of study\\Seminars\\Java_next\\src\\Exceptions\\HomeWorks\\HomeWork_01\\Task_03\\" +
//                "database2.txt");

//  Файл, где есть строки без чисел
        ArrayList<String> ourStrings = readFile("C:\\Users\\PMPav\\OneDrive\\Рабочий стол\\" +
                "Second block of study\\Seminars\\Java_next\\src\\Exceptions\\HomeWorks\\HomeWork_01\\Task_03\\" +
                "database1.txt");

        System.out.printf("Самма чисел = %d", mainProgram(ourStrings));

    }

    public static ArrayList<String> readFile(String path) throws FileNotFoundException {

        ArrayList<String> ourStrings = new ArrayList<>();

        Scanner sc = new Scanner(new File(path));

        while (sc.hasNextLine()){
            ourStrings.add(sc.nextLine());
        }

        sc.close();
        return ourStrings;
    }

    public static int mainProgram(ArrayList<String> ourStrings){
        ArrayList<Integer> ourDigit = new ArrayList<>();
        int result = 0;

        for (int i = 0; i < ourStrings.size(); i++) {
            String number = "";
            for (int j = 0; j < ourStrings.get(i).length(); j++) {

                if (Character.isDigit(ourStrings.get(i).charAt(j))){
                    number += ourStrings.get(i).charAt(j);
                } else {
                    throw new NumberFormatException("Некорректное значение числа в файле");
                }
            }
            result += Integer.parseInt(number);
        }
        return result;
    }
}
