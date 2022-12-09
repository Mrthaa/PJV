package BarvaRGB;

public class BarvaRGB {
    private byte r;
    private byte g;
    private byte b;

    public BarvaRGB(byte r, byte g, byte b) {
        setRGB(r,g,b);
    }

    public void setR(byte v) {
        this.r = v;
    }

    public void setG(byte v) {
        this.g = v;
    }

    public void setB(byte v) {
        this.b = v;
    }

    public void setRGB(byte r, byte g, byte b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String toString() {
        return String.format("#%02X%02X%02X", r, g, b);
    }

}
