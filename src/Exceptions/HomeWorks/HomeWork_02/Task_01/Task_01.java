package Exceptions.HomeWorks.HomeWork_02.Task_01;

// Задача 1:
// Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
// Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с
// сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) throws InvalidNumberException {
        Scanner sc = new Scanner(System.in);
        checkNumber(sc);
    }

    public static void checkNumber(Scanner sc) throws InvalidNumberException {
        System.out.print("Введите число: ");
        int number = sc.nextInt();

        if (number <= 0) {
            throw new InvalidNumberException("Некорректное число");
        }

        System.out.println("Число корректно");
    }

}
