import Funkce.Funkce_Kvadraticka;
import Funkce.Funkce_Primka;

public class Main {
    public static void main(String[] args) {
        Funkce_Kvadraticka obj1 = new Funkce_Kvadraticka(1, 7, 12);
        Funkce_Kvadraticka obj2 = new Funkce_Kvadraticka(1, 7, 12);
        Funkce_Kvadraticka obj3 = new Funkce_Kvadraticka(1, 6, 12);
        System.out.println(obj1.calc_y(-3));
        System.out.println(obj1.calc_y(-4));
        System.out.println(obj1.nazev_objektu());
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj3));
        System.out.println(obj1);

        System.out.println("--------------------------");
        Funkce_Primka obj4 = new Funkce_Primka(3, -18);
        Funkce_Primka obj5 = new Funkce_Primka(3, -18);
        Funkce_Primka obj6 = new Funkce_Primka(3, -4);
        System.out.println(obj4.calc_y(6));
        System.out.println(obj4.nazev_objektu());
        System.out.println(obj4.equals(obj5));
        System.out.println(obj4.equals(obj6));
        System.out.println(obj4);
    }
}