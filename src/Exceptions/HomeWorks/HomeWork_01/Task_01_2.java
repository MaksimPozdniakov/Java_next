package Exceptions.HomeWorks.HomeWork_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_01_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        while (true) {
            try {
                System.out.print("Введите число a: ");
                a = scanner.nextInt();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Ошибка: некорректный ввод");
                scanner.nextLine(); // Очистка буфера после некорректного ввода
            }
        }

        while (true) {
            try {
                System.out.print("Введите число b: ");
                b = scanner.nextInt();
                if (b != 0) {
                    break;
                } else {
                    System.out.println("Ошибка: деление на ноль недопустимо");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Ошибка: некорректный ввод");
                scanner.nextLine(); // Очистка буфера после некорректного ввода
            }
        }

        double result = (double) a / b;
        System.out.println("Результат деления: " + result);
        scanner.close();
    }
}
