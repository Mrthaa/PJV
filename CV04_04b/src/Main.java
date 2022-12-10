import Funkce.Funkce;
import Funkce.Funkce_Kvadraticka;
import Funkce.Funkce_Primka;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funkce_Kvadraticka obj1 = new Funkce_Kvadraticka(1, 7, 12);
        Funkce_Kvadraticka obj2 = new Funkce_Kvadraticka(1, 7, 12);
        Funkce_Kvadraticka obj3 = new Funkce_Kvadraticka(1, 6, 12);

        Funkce_Primka obj4 = new Funkce_Primka(3, -18);
        Funkce_Primka obj5 = new Funkce_Primka(3, -18);
        Funkce_Primka obj6 = new Funkce_Primka(3, -4);

        ArrayList<Funkce> arr = new ArrayList<>(List.of(obj1, obj3, obj6, obj4, obj2, obj5));
        addToArrayList(arr, obj1); // Nic nepřidá, vrátí false - objekt už v ArrayListu je
        printAllObjects(arr);
        printPrimky(arr);
        printKvadra(arr);
    }

    private static boolean addToArrayList(ArrayList<Funkce> arr, Funkce fn) {
        if(!arr.contains(fn)) return arr.add(fn);
        return false;
    }

    private static void printAllObjects(ArrayList<Funkce> arr) {
        for(Object o : arr)
            System.out.println(o);
        System.out.println("");
    }

    private static void printPrimky(ArrayList<Funkce> arr) {
        for(Object o : arr)
            if(o instanceof Funkce_Primka) System.out.println(o);
        System.out.println("");
    }

    private static void printKvadra(ArrayList<Funkce> arr) {
        for(Object o : arr)
            if(o instanceof Funkce_Kvadraticka) System.out.println(o);
        System.out.println("");
    }
}