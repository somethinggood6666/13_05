package by.epam.shchemelev.task_2;

import by.epam.shchemelev.exceptions.NotValidNumberException;
import by.epam.shchemelev.tools.InputTools;

public class DaysAmount {

    private final static int[] daysInMonth = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int calculateDaysAmount(int year, int month) throws NotValidNumberException {
        if (!InputTools.isIntegerNumberInRange(month, 1, 12)){
            throw new NotValidNumberException("Month has wrong number format");
        }
        if (month == 2){
            if (isLeap(year)){
                return 29;
            }
            return 28;
        }
        return daysInMonth[month - 1];
    }

    public static boolean isLeap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0));
    }

}
