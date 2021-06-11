package by.epam.shchemelev.task_9;

import by.epam.shchemelev.exceptions.NotValidNumberException;

public class CircleOperations {

    private static final double Pi = 3.1415;

    public static double calculateArea(int radius) throws NotValidNumberException {
        if (radius <= 0){
            throw new NotValidNumberException("radius must be positive");
        }
        return Pi * radius * radius;
    }

    public static double calculateLength(int radius) throws NotValidNumberException {
        if (radius <= 0){
            throw new NotValidNumberException("radius must be positive");
        }
        return 2 * Pi * radius;
    }

}
