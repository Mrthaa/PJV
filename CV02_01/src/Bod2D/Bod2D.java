package Bod2D;

public class Bod2D {

    protected double x;
    protected double y;

    public Bod2D(double x, double y) {
        setLocation(x,y);
    }

    public String toString() {
        return "[" + this.x + ";" + this.y + "]";
    }

    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
    }

}
