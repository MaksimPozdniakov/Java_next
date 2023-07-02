package Exceptions.HomeWorks.HomeWork_02.Task_03;

// Задача 3.
// Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

// Если первое число больше 100, выбросить исключение NumberOutOfRangeException
// с сообщением "Первое число вне допустимого диапазона".

// Если второе число меньше 0, выбросить исключение NumberOutOfRangeException
// с сообщением "Второе число вне допустимого диапазона".

// Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException
// с сообщением "Сумма первого и второго чисел слишком мала".

// Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".

// В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
// - необходимо создать 3 класса собственных исключений

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        checkNumber(sc);

    }

    public static void checkNumber(Scanner sc) {
        int firstNumber, secondNumber, thirdNumber;
        int sum = 0;

        while (true) {
            try {
                System.out.print("Введите первое число: ");
                firstNumber = sc.nextInt();
                if (firstNumber > 100){
                    throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
                }
                break;

            } catch (InputMismatchException e) {
                System.out.println("Введено некоректное число!");
                sc.nextLine();
            } catch (NumberOutOfRangeException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Введите второе число: ");
                secondNumber = sc.nextInt();
                if (secondNumber < 0) {
                    throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введено некоректное число!");
                sc.nextLine();
            } catch (NumberOutOfRangeException e) {
                System.out.println(e.getMessage());
            }
        }


        sum = firstNumber + secondNumber;
        try {
            if (sum < 10) {
                throw new NumberSumException("Сумма первого и второго чисел слишком мала");
            }
        } catch (NumberSumException e) {
            System.out.println(e.getMessage());
        }

        while (true) {
            try {
                System.out.print("Введите третье число: ");
                thirdNumber = sc.nextInt();
                if (thirdNumber == 0) {
                    throw new DivisionByZeroException("Деление на ноль недопустимо");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введено некоректное число!");
                sc.nextLine();
            } catch (DivisionByZeroException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Проверка пройдена успешно");

    }
}
