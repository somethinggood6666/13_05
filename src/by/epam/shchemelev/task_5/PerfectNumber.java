package by.epam.shchemelev.task_5;

import by.epam.shchemelev.exceptions.NotValidNumberException;

public class PerfectNumber {

    public static boolean isNumberPerfect(int number) throws NotValidNumberException {
        if (number <= 0){
            throw new NotValidNumberException("Number must be positive");
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0){
                sum += i;
            }
        }
        return sum == number;
    }

}
