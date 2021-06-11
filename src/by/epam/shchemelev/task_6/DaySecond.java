package by.epam.shchemelev.task_6;

import by.epam.shchemelev.exceptions.NotValidNumberException;

// как мне кажется, условие составлено немного непонятно
// поэтому программа считает и количество полных минут, часов и секунд,
// и текущее время
public class DaySecond {

    final static int secondsInMinute = 60;
    final static int minutesInHour = 60;
    final static int hoursInDay = 24;

    public static int calculateMinutes(int seconds) throws NotValidNumberException {
        if (seconds < 0){
            throw new NotValidNumberException("seconds must be positive");
        }
        return seconds / secondsInMinute;
    }

    public static int calculateHours(int seconds) throws NotValidNumberException {
        if (seconds < 0){
            throw new NotValidNumberException("seconds must be positive");
        }
        return seconds / (minutesInHour * secondsInMinute);
    }

    public static int calculateTimeMinute(int minutes, int hours) throws NotValidNumberException {
        if (minutes < 0 || hours < 0){
            throw new NotValidNumberException("Minutes and hours must be positive");
        }
        return minutes - hours * minutesInHour;
    }

    public static int calculateTimeSecond(int currentSecond, int hours, int currentTimeMinute) throws NotValidNumberException {
        if (currentSecond < 0 || hours < 0 || currentTimeMinute < 0){
            throw new NotValidNumberException("Minutes, seconds and hours must be positive");
        }
        return currentSecond - hours * minutesInHour * secondsInMinute - currentTimeMinute * secondsInMinute;
    }

}
