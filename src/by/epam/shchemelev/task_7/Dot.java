package by.epam.shchemelev.task_7;

import java.io.Serializable;

public class Dot implements Serializable {
    private int xCoord;
    private int yCoord;
    private final String dotName;

    public Dot(String dotName) {
        this.dotName = dotName;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public double calculateDistationToCoordsStart(){
        return Math.sqrt(xCoord * xCoord + yCoord * yCoord);
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public String getDotName() {
        return dotName;
    }

    @Override
    public String toString() {
        return "точка " + dotName + " c координатами х: " + xCoord + ", y: " + yCoord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dot dot = (Dot) o;
        return xCoord == dot.xCoord && yCoord == dot.yCoord && dotName.equals(dot.dotName);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + getxCoord();
        result = 37 * result + getyCoord();
        result = 37 * result + (getDotName() == null ? 0 : getDotName().hashCode());

        return result;
    }
}
