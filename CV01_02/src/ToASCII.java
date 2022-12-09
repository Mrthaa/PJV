import java.util.Scanner;

public class ToASCII {
    public static void print(char c) {
        System.out.println(convert(c));
    }

    public static void printTableA() {
        printHeader();
        for(int i = 65; i <= 90; i++) {
            System.out.printf("|\t%-8c | %-3d | %-3s |\t\t%-5c | %-3d | %-3s |%n", (char)i, i, Integer.toHexString(i), (char)i+32, i+32, Integer.toHexString(i+32));
        }
        printFooter();
    }

    public static void printTableB() {
        printHeader();
        for(int i = 65; i <= 90; i++) {
            System.out.printf(formatString(i));
        }
        printFooter();
    }

    private static void printHeader() {
        System.out.printf(
                "+------------+-----+-----+------------+-----+-----+%n" +
                "| upper case | dec | hex | lower case | dec | hex |%n" +
                "+------------+-----+-----+------------+-----+-----+%n");
    }

    private static void printFooter() {
        System.out.printf("+------------+-----+-----+------------+-----+-----+%n");
    }

    @SuppressWarnings("all")
    private static String formatString(int i) {
        return String.format("|\t%-8c | %-3d | %-3s |\t\t%-5c | %-3d | %-3s |%n", (char)i, i, Integer.toHexString(i), (char)i+32, i+32, Integer.toHexString(i+32));
    }

    private static String convert(char c) {
        return "CHAR: " + c + " \tDEC: " + (int)c + "\tHEX: " + Integer.toHexString(c);
    }
}

/*
f) Metoda v přehledová tabulce vytiskne ASCII kódy písmen anglické abecedy (velká a malá písmena) a ASCII kódy znaků cifer (dekadicky a hexadecimálně). A to tak, aby příslušná velká a malá písmena byla na stejném řádku, tedy více sloupcová tabulka.
Pozn: použijte pro zarovnání tabulátor a speciální znaky pro orámování "tabulky", které najdeme v ASCII tabulce. Implementaci řešte ve static metodě.
	a) Řešte to přímým tiskem.
	b) Metoda, která sestaví řetězec a vrátí jej v návratové hodnotě. Další metoda s využitím této metody výsledek vytiskne.
 */
