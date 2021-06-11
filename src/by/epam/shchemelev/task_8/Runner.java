package by.epam.shchemelev.task_8;

import by.epam.shchemelev.tools.InputTools;

public class Runner {
    public static void main(String[] args) {
        int x = InputTools.inputIntegerNumber("integer");
        double value = FunctionValue.calculateValue(x);
        System.out.printf("Значение функции = %.2f", value);
    }
}
