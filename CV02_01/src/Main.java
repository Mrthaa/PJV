import BarvaRGB.BarvaRGB;
import BarvaRGB.BarvaRGBb;
import Bod2D.Bod2D;
import Bod2D.Bod2D_Extend;
import Bod2D.Bod2Db;

public class Main {
    public static void main(String[] args) {
        Bod2D bod = new Bod2D(5, 0);
        System.out.print("Bod2D: " + bod + " ; ");
        bod.setLocation(10,4);
        System.out.println("setLocation: " + bod);

        Bod2Db bodb = new Bod2Db(5, 0);
        System.out.println("Bod2Db: " + bodb);

        BarvaRGB barva = new BarvaRGB((byte)152, (byte)152, (byte)152);
        System.out.print("BarvaRGB: " + barva + " ; ");
        barva.setRGB((byte)255,(byte)255, (byte)255);
        System.out.println("setRGB: " + barva);

        BarvaRGBb barvab = new BarvaRGBb((byte)152, (byte)152, (byte)152);
        System.out.println("BarvaRGBb: " + barvab);

        Bod2D_Extend bodExtend = new Bod2D_Extend(5, 0, new BarvaRGB((byte)152, (byte)152, (byte)152));
        System.out.print("Bod2D_Extend: " + bodExtend + " ; ");
        bodExtend.move(10, 4);
        System.out.print("move: " + bodExtend + " ; ");
        bodExtend.setColor(new BarvaRGB((byte)0,(byte)0, (byte)0));
        System.out.println("setColor: " + bodExtend);
    }
}