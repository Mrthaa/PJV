package Funkce;

public class Funkce_Primka extends Funkce {

    private final double k;
    private final double q;

    private final String TYPE = "Primka";

    public Funkce_Primka(double k, double q) {
        this.k = k;
        this.q = q;
    }

    public double calc_y(double x) {
        return this.k * x + this.q;
    }

    public String nazev_objektu() {
        return this.TYPE;
    }

    public boolean equals(Funkce_Primka obj) {
        return this.k == obj.k && this.q == obj.q;
    }

    public String toString() {
        return "f(x) = " + this.k + "x + " + this.q;
    }
}

/*
Funkce.Funkce_Primka : Funkce.Funkce
        double k
        double q
        String TYPE
        Funkce.Funkce_Primka(double k, double q) : constructor
        double calc_y(double x) : y = kx + q
        String nazev_objektu() : TYPE
        boolean equals(Funkce.Funkce_Primka primka)
        String toString() : "f(x) = kx + q"
 */
