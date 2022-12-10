package Funkce;

public class Funkce_Kvadraticka extends Funkce {

    private final double a;
    private final double b;
    private final double c;

    private final String TYPE = "Kvadraticka rovnice";

    public Funkce_Kvadraticka(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calc_y(double x) {
        return this.a * Math.pow(x, 2) + this.b * x + this.c;
    }

    public String nazev_objektu() {
        return this.TYPE;
    }

    public int pocet_korenu() {
        double diskriminant = diskriminant();

        if(diskriminant < 0) return 0;
        else if(diskriminant == 0) return 1;
        else return 2;
    }

    public double diskriminant() {
        return Math.pow(this.b, 2) - (4 * this.a * this.c);
    }

    public boolean equals(Funkce_Kvadraticka obj) {
        return this.a == obj.a && this.b == obj.b && this.c == obj.c;
    }

    public String toString() {
        return "f(x) = " + this.a + "x^2 + " + this.b + "x + " + this.c;
    }

}

/*
Funkce.Funkce_Kvadraticka: Funkce.Funkce
        double a
        double b
        double c
        Funkce.Funkce_Kvadraticka(double a, double b, double c) : constructor
        double calc_y(double x) :  y = ax^2 + bx + c
        String nazev_objektu() : TYPE
        int pocet_korenu() : D < 0, D > 0, D == 0
        double diskriminant() : b^2 - 4 * a * c;
        boolean equals(Funkce.Funkce_Kvadraticka kvadraticka)
        String toString() : "f(x) = ax^2 + bx + c"
 */
