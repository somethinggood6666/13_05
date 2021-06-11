package by.epam.shchemelev.task_1;

public class EvenNumbers {

    public static int getLastDigit(int number){
        return number % 10;
    }

    public static int calculateLastSquareDigit(int number){
        return number * number % 10;
    }
}
