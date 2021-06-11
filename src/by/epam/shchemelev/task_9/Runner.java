package by.epam.shchemelev.task_9;

import by.epam.shchemelev.exceptions.NotValidNumberException;
import by.epam.shchemelev.tools.InputTools;

public class Runner {
    public static void main(String[] args) {
        int radius = InputTools.inputIntegerNumber("natural");
        double circleLength = 0;
        double circleArea = 0;
        try {
            circleLength = CircleOperations.calculateLength(radius);
            circleArea = CircleOperations.calculateArea(radius);
        } catch (NotValidNumberException e) {
            e.printStackTrace();
        }

        System.out.printf("Длина окружности: %.3f, площадь круга: %.3f", circleLength, circleArea);
    }
}
