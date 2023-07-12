package Exceptions.HomeWorks.HomeWork_03.Task_01;


public class PowerCalculator {
    int firstNumber;
    int secondNumber;


    public PowerCalculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public String calculatePower(){

        int result = 0;

        try {
            if (firstNumber == 0 && secondNumber < 0) {
                throw new InvalidInputException("\tInvalidInputException: Основание не может быть равно 0, " +
                        "а степень не может быть отрицательной!");
            }
            result = (int) Math.pow(firstNumber,secondNumber);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        return "Результат возведенния в степень = " + result;

    }
}
