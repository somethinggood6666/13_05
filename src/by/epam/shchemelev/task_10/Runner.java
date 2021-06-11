package by.epam.shchemelev.task_10;

import by.epam.shchemelev.exceptions.NotValidNumberException;
import by.epam.shchemelev.tools.InputTools;

public class Runner {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        while (a > b) {
            System.out.println("Введите границу A");
            a = InputTools.inputIntegerNumber("integer");
            System.out.println("Введите границу B");
            b = InputTools.inputIntegerNumber("integer");
            if (a > b){
                System.out.println("Число А должно быть меньше числа B");
            }
        }
        System.out.println("Введите шаг h");
        int h = InputTools.inputIntegerNumber("natural");

        int size = 0;
        try {
            size = ValueOnSegment.calculateArraySize(a, b, h);
        } catch (NotValidNumberException e) {
            e.printStackTrace();
        }
        double[][] result = new double[size][2];
        try {
            ValueOnSegment.calculateFunction(result, a, b, h);
        } catch (NotValidNumberException e) {
            e.printStackTrace();
        }
        outputSolution(result);
    }

    public static void outputSolution(double[][] result) {
        System.out.println("Аргумент   | Функция");
        System.out.println("----------------------");
        for (double[] doubles : result) {
            System.out.printf("%10.3f | %10.5f\n", doubles[0], doubles[1]);
        }
        System.out.println("----------------------");
    }
}
