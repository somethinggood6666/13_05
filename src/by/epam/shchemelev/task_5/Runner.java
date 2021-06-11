package by.epam.shchemelev.task_5;

import by.epam.shchemelev.exceptions.NotValidNumberException;
import by.epam.shchemelev.tools.InputTools;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите ваше число:");
        int number = InputTools.inputIntegerNumber("natural");
        boolean validality = false;
        try {
            validality = PerfectNumber.isNumberPerfect(number);
        } catch (NotValidNumberException e) {
            e.printStackTrace();
        }
        System.out.println(validality ? "Число совершенно" : "Число не совершенно");
    }
}
