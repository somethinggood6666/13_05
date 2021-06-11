package by.epam.shchemelev.task_2;

import by.epam.shchemelev.exceptions.NotValidNumberException;
import by.epam.shchemelev.tools.InputTools;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите номер года:");
        int year = InputTools.inputIntegerNumber("natural");
        System.out.println("Введите номер месяца (например: для января - цифра 1):");
        int month = InputTools.inputIntegerNumberInRange(1, 12);
        int daysAmount = 0;
        try {
            daysAmount = DaysAmount.calculateDaysAmount(year, month);
        } catch (NotValidNumberException e) {
            e.printStackTrace();
        }
        System.out.printf("Количество дней в указанном месяце: %d", daysAmount);
    }
}
