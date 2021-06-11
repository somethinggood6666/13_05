package by.epam.shchemelev.task_4;

import by.epam.shchemelev.exceptions.NotValidDataException;
import by.epam.shchemelev.tools.InputTools;

public class Runner {
    public static void main(String[] args) {
        int[] numbers = InputTools.inputIntegerArray(4);
        boolean validality = false;
        try {
            validality = TrueExpression.isAtLeastTwoEven(numbers);
        } catch (NotValidDataException e) {
            e.printStackTrace();
        }
        System.out.println(validality ? "Условие выполняется" : "Условие не выполняется");
    }

}
