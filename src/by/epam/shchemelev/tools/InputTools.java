package by.epam.shchemelev.tools;

import java.util.Scanner;

public class InputTools {
    public static int inputIntegerNumber(String numberType){
        Scanner scanner = new Scanner(System.in);
        while (true){
            String value = scanner.nextLine();
            if (numberType.equals("natural") ? isNaturalNumber(value) : isNumber(value)){
                return Integer.parseInt(value);
            } else {
                System.out.println("Число введено в неправильном формате, попробуйте снова");
            }
        }
    }

    public static int inputIntegerNumberInRange(int rangeFrom, int rangeTo){
        Scanner scanner = new Scanner(System.in);
        while (true){
            String value = scanner.nextLine();
            if (isNumberInRange(value, rangeFrom, rangeTo)){
                return Integer.parseInt(value);
            } else {
                System.out.println("Число введено в неправильном формате или не соответствует нужному диапазону чисел, попробуйте снова");
            }
        }
    }

    public static int[] inputIntegerArray(int amount) {
        int[] resultArray = new int[amount];
        for (int i = 0; i < amount; i++) {
            System.out.printf("Введите %d число:\n", i + 1);
            Scanner scanner = new Scanner(System.in);
            while (true){
                String value = scanner.nextLine();
                if (isNumber(value)){
                    resultArray[i] = Integer.parseInt(value);
                    break;
                } else {
                    System.out.println("Число введено в неправильном формате, попробуйте снова");
                }
            }
        }
        return resultArray;
    }

    public static boolean isNumber(String number){
        return number.matches("[-+]?\\d+");
    }

    public static boolean isNumberInRange(String number, int rangeFrom, int rangeTo){
        return number.matches("[-+]?\\d+") && Integer.parseInt(number) >= rangeFrom && Integer.parseInt(number) <= rangeTo;
    }

    public static boolean isIntegerNumberInRange(int number, int rangeFrom, int rangeTo){
        return number >= rangeFrom && number <= rangeTo;
    }

    public static boolean isNaturalNumber(String number){
        return number.matches("\\d+");
    }
}
