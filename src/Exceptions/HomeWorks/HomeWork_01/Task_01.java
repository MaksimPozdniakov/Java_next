package Exceptions.HomeWorks.HomeWork_01;

//Проверка деления на ноль
//Напишите программу, которая запрашивает у пользователя два целых числа и выполняет их деление.
//Если второе число равно нулю, выбросите исключение ArithmeticException
//с сообщением "Деление на ноль недопустимо". Иначе выведите результат деления на экран.

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(divide(sc));
        sc.close();

    }

    public static int divide(Scanner sc) {
        System.out.print("Введите первое число: ");
        int firstNumber = sc.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = sc.nextInt();

        if (secondNumber == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }

        return firstNumber/secondNumber;
    }
}
