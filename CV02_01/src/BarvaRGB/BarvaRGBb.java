package BarvaRGB;

public class BarvaRGBb {
    private final byte r;
    private final byte g;
    private final byte b;

    public BarvaRGBb(byte r, byte g, byte b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String toString() {
        return String.format("#%02X%02X%02X", r, g, b);
    }

}
