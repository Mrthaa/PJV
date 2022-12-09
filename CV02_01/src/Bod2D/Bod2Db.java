package Bod2D;

public class Bod2Db {

    protected double x;
    protected double y;

    public Bod2Db(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + this.x + ";" + this.y + "]";
    }
}
