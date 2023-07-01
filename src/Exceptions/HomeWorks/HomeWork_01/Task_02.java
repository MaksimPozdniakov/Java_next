package Exceptions.HomeWorks.HomeWork_01;

//Обработка некорректного ввода
//Напишите программу, которая запрашивает у пользователя его возраст. Если введенное значение не является числом,
//выбросите исключение NumberFormatException с сообщением "Некорректный ввод". Иначе выведите возраст на экран.


import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(age(sc));
    }

    public static int age(Scanner sc){
        System.out.print("Укажите свой возраст: ");

        if (!sc.hasNextInt()){
            throw new NumberFormatException("Некорректный ввод");
        }

        int age = sc.nextInt();
        return age;
    }
}
