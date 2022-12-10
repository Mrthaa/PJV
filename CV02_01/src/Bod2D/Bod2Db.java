package Bod2D;

public class Bod2Db {

    private double x;
    private double y;

    public Bod2Db(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "[" + this.x + ";" + this.y + "]";
    }
}
