package by.epam.shchemelev.task_4;

import by.epam.shchemelev.exceptions.NotValidDataException;

public class TrueExpression {

    public static boolean isAtLeastTwoEven(int[] numbers) throws NotValidDataException {
        if (numbers.length == 0){
            throw new NotValidDataException("Array must be filled");
        }
        int counter = 0;
        for (int number : numbers) {
            if (isEven(number)) {
                counter++;
                if (counter == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
