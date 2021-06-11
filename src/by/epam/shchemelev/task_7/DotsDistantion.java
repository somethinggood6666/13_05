package by.epam.shchemelev.task_7;

import by.epam.shchemelev.exceptions.NotValidDataException;
import by.epam.shchemelev.tools.InputTools;

public class DotsDistantion {

    public static Dot calculateClosestDot(Dot dotA, Dot dotB) throws NotValidDataException {
        if (dotA == null || dotB == null){
            throw new NotValidDataException("Dots must be not null");
        }
        if (dotA.calculateDistationToCoordsStart() < dotB.calculateDistationToCoordsStart()) {
            return dotA;
        }
        if (dotA.calculateDistationToCoordsStart() > dotB.calculateDistationToCoordsStart()) {
            return dotB;
        }
        return null;
    }

    public static void inputDotCoord(Dot dot, String coordName, String dotName) throws NotValidDataException {
        if (dot == null){
            throw new NotValidDataException("Dot must be not null");
        }
        if (!coordName.equalsIgnoreCase("x") && !coordName.equalsIgnoreCase("y")){
            throw new NotValidDataException("Illegal coordinate name");
        }
        if (dotName.isEmpty()){
            throw new NotValidDataException("Dot name cannot be null");
        }
        System.out.printf("Введите %s координату точки %s ", coordName, dotName);
        if (coordName.equalsIgnoreCase("x")) {
            dot.setxCoord(InputTools.inputIntegerNumber("integer"));
        } else {
            dot.setyCoord(InputTools.inputIntegerNumber("integer"));
        }
    }
}
