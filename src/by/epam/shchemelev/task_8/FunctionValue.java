package by.epam.shchemelev.task_8;

public class FunctionValue {

    public static double calculateValue(int x) {
        if (x >= 3){
            return -(x * x) + 3 * x + 9;
        }
        return 1 / (Math.pow(x, 3) - 6);
    }

}
