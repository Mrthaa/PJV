package BarvaRGB;

public class BarvaRGB {
    private byte r;
    private byte g;
    private byte b;

    public BarvaRGB(byte r, byte g, byte b) {
        setRGB(r,g,b);
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
