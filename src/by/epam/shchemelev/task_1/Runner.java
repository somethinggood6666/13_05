package by.epam.shchemelev.task_1;

import by.epam.shchemelev.tools.InputTools;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите ваше число:");
        int number = InputTools.inputIntegerNumber("integer");
        int lastDigit = EvenNumbers.getLastDigit(number);
        int lastSquareDigit = EvenNumbers.calculateLastSquareDigit(lastDigit);
        System.out.printf("Последняя цифра квадрата числа: %d", lastSquareDigit);
    }
}
