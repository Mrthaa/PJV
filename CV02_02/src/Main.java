import java.util.Scanner;

public class Main {

    private static Nadrz nadrz;
    private static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.print("Zadej kapacitu nadrze: ");
        int input = scan.nextInt();
        nadrz = new Nadrz(Obsah.VODA, input);

        while(true) {
            printMenu();
            input = scan.nextInt();
            if(input < 1 || input > 4) continue;
            if(input == 4) break;
            resolveInput(input);
        }
    }

    private static void resolveInput(int input) {
        try {
            switch (input) {
                case 1 -> {
                    System.out.print("Kolik chces do nadrze pridat: ");
                    input = scan.nextInt();
                    nadrz.fill(input);
                }
                case 2 -> {
                    System.out.print("Kolik chces z nadrze odebrat: ");
                    input = scan.nextInt();
                    nadrz.empty(input);
                }
                case 3 -> {
                    System.out.println(nadrz);
                }
            }
        } catch(MyException_PrazdnaNadrz|MyException_PlnaNadrz e) {
            System.out.println("CHYBA: " + e.getMessage());
        }
    }

    private static void printMenu() {
        System.out.println("\n1: Naplnit nadrz");
        System.out.println("2: Vyprazdnit nadrz");
        System.out.println("3: Vypsat obsah nadrze");
        System.out.println("4: Konec\n");
        System.out.print("Co chces udelat: ");
    }
}