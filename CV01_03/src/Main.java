import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Zadej short: ");
        System.out.println("Value: " + readShort());
        System.out.println("Zadej int: ");
        System.out.println("Value: " + readInt());
        System.out.println("Zadej float: ");
        System.out.println("Value: " + readFloat());
        System.out.println("Zadej double: ");
        System.out.println("Value: " + readDouble());
        System.out.println("Zadej string: ");
        System.out.println("Value: " + readString());
        System.out.println("Zadej char: ");
        System.out.println("Value: " + readChar());
    }

    public static Short readShort() throws NumberFormatException {
        try {
            return Short.parseShort(scan.nextLine());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Integer readInt() throws NumberFormatException {
        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Float readFloat() throws NumberFormatException {
        try {
            return Float.parseFloat(scan.nextLine());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Double readDouble() throws NumberFormatException {
        try {
            return Double.parseDouble(scan.nextLine());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static String readString() {
        return scan.nextLine();
    }

    public static Character readChar() {
        String temp = scan.nextLine();
        return temp.length() == 1 ? temp.charAt(0) : null;
    }
}