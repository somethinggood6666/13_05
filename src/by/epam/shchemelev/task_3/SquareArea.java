package by.epam.shchemelev.task_3;

import by.epam.shchemelev.exceptions.NotValidNumberException;

public class SquareArea {
    public static double calculateSquareArea(int area) throws NotValidNumberException {
        if (area <= 0){
            throw new NotValidNumberException("Area must be positive");
        }
        double radius = Math.sqrt(area) / 2;
        return radius * radius * 2;
    }

    public static double calculateDifference(int firstArea, double secondArea) throws NotValidNumberException {
        if (Double.compare(secondArea, 0.0) == 0){
            throw new NotValidNumberException("Second area cannot be zero");
        }
        return firstArea / secondArea;
    }

}
