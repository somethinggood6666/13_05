package by.epam.shchemelev.task_6;

import by.epam.shchemelev.exceptions.NotValidNumberException;
import by.epam.shchemelev.tools.InputTools;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите текущую секунду:");
        int currentSecond = InputTools.inputIntegerNumberInRange(0, DaySecond.secondsInMinute * DaySecond.minutesInHour * DaySecond.hoursInDay);
        int totalHours = 0;
        int currentTimeSecond = 0;
        int currentTimeMinute = 0;
        int totalMinutes = 0;
        try {
            totalHours = DaySecond.calculateHours(currentSecond);
            totalMinutes = DaySecond.calculateMinutes(currentSecond);
            currentTimeMinute = DaySecond.calculateTimeMinute(totalMinutes, totalHours);
            currentTimeSecond = DaySecond.calculateTimeSecond(currentSecond, totalHours, currentTimeMinute);
        } catch (NotValidNumberException e) {
            e.printStackTrace();
        }


        System.out.printf("С начало суток полных часов прошло: %d, полных минут прошло: %d, полных секунд прошло: %d\n", totalHours, totalMinutes, currentSecond);
        System.out.printf("Текущее время: %d:%d:%d", totalHours, currentTimeMinute, currentTimeSecond);
    }
}
