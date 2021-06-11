package by.epam.shchemelev.task_10;

import by.epam.shchemelev.exceptions.NotValidNumberException;

public class ValueOnSegment {

    public static void calculateFunction(double[][] result, int a, int b, int h) throws NotValidNumberException {
        if (a > b){
            throw new NotValidNumberException("A must be lower then B");
        }
        int k = 0;
        for (int i = a; i <= b; i += h) {
            result[k][0] = i;
            result[k][1] = Math.tan(i);
            k++;
        }
    }

    public static int calculateArraySize(int b, int a, int h) throws NotValidNumberException {
        if (a > b){
            throw new NotValidNumberException("A must be lower then B");
        }
        return (b - a) / h + 1;
    }



}
