package by.epam.shchemelev.task_3;

import by.epam.shchemelev.exceptions.NotValidNumberException;
import by.epam.shchemelev.tools.InputTools;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите площадь квадрата:");
        int firstArea = InputTools.inputIntegerNumber("natural");
        double secondArea = 0;
        double difference = 0;
        try {
            secondArea = SquareArea.calculateSquareArea(firstArea);
            difference = SquareArea.calculateDifference(firstArea, secondArea);
        } catch (NotValidNumberException e) {
            e.printStackTrace();
        }

        System.out.printf("Площадь вписанного квадрата: %.2f, в %.2f раз меньше площади начального квадрата", secondArea, difference);
    }
}
