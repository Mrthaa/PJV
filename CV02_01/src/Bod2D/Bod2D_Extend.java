package Bod2D;

import BarvaRGB.BarvaRGB;

public class Bod2D_Extend extends Bod2Db {

    private BarvaRGB color;

    public Bod2D_Extend(double x, double y, BarvaRGB color) {
        super(x, y);
        this.color = color;
    }

    public void move(double dx, double dy) {
        this.x = dx;
        this.y = dy;
    }

    public void setColor(BarvaRGB color) {
        this.color = color;
    }

    public String toString() {
        return super.toString() + ":" + color.toString();
    }
}
