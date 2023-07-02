package Exceptions.HomeWorks.HomeWork_02.Task_02;

// Задача 2:
// Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
// Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException
// с сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) throws DivisionByZeroException{
        Scanner sc = new Scanner(System.in);
        System.out.println(divide(sc));
    }

    public static int divide(Scanner sc) throws DivisionByZeroException{

        int firstNumber, seccondNumber;

        while (true){
            try {
                System.out.print("Введите первое число: ");
                firstNumber = sc.nextInt();
                break;
            } catch (InputMismatchException e){
                System.out.println("Некоректный ввод");
                sc.nextLine();
            }
        }

        while (true){
            try {
                System.out.print("Введите второе число: ");
                seccondNumber = sc.nextInt();
                if (seccondNumber <= 0) {
                    throw new DivisionByZeroException("Деление на ноль недопустимо");
                }
                break;
            } catch (InputMismatchException e){
                System.out.println("Некоректный ввод");
                sc.nextLine();
            }
        }

        return firstNumber/seccondNumber;
    }

}
