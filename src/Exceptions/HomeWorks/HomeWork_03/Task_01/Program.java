package Exceptions.HomeWorks.HomeWork_03.Task_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = firstNumber(sc);
        int secondNumber = secondNumber(sc);
        PowerCalculator calc = new PowerCalculator(firstNumber,secondNumber);
        System.out.println(calc.calculatePower());
    }

    public static int firstNumber(Scanner sc){
       int firstNumber;
        while (true) {
            try {
                System.out.print("Введите число: ");
                firstNumber = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Некоректный ввод");
                sc.nextLine();
            }
        }
        return firstNumber;
    }

    public static int secondNumber(Scanner sc){
        int secondNumber;
        while(true) {
            try {
                System.out.print("Введите степень: ");
                secondNumber = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Некоректный ввод");
                sc.nextLine();
            }
        }
        return secondNumber;
    }

}
