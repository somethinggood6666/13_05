package by.epam.shchemelev.task_7;

import by.epam.shchemelev.exceptions.NotValidDataException;

public class Runner {
    public static void main(String[] args) {
        Dot dotA = new Dot("A");
        Dot dotB = new Dot("B");

        try {
            DotsDistantion.inputDotCoord(dotA, "X", "A");
            DotsDistantion.inputDotCoord(dotA, "Y", "A");
            DotsDistantion.inputDotCoord(dotB, "X", "B");
            DotsDistantion.inputDotCoord(dotB, "Y", "B");
        } catch (NotValidDataException e) {
            e.printStackTrace();
        }

        Dot closestDot = null;
        try {
            closestDot = DotsDistantion.calculateClosestDot(dotA, dotB);
        } catch (NotValidDataException e) {
            e.printStackTrace();
        }
        if (closestDot != null) {
            System.out.println("Ближайшая точка это " + closestDot);
        } else {
            System.out.println("Точки находятся на одинаковом расстоянии");
        }
    }
}
