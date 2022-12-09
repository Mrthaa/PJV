import java.util.Arrays;

public class Main {
    public static void parseJmenoPrijmeni1(String str) {
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
    }

    public static String[] parseJmenoPrijmeni2(String str) {
        return str.trim().replaceAll("\\s{2,}", " ").split(" ");
    }

    public static String[] parseLogin(String str) {
        return str.split(";");
    }

    public static int[] parseCislaInt(String str) {
        String[] str2 = str.split(";");
        int[] arr = new int[str2.length];
        for(int i = 0; i < str2.length; i++)
            arr[i] = Integer.parseInt(str2[i]);
        return arr;
    }

    public static double[] parseCislaDouble(String str) {
        String[] str2 = str.split(";");
        double[] arr = new double[str2.length];
        for(int i = 0; i < str2.length; i++)
            arr[i] = Double.parseDouble(str2[i]);
        return arr;
    }

    public static void main(String[] args) {
        parseJmenoPrijmeni1("Dominik Volavka");
        System.out.println(Arrays.toString(parseJmenoPrijmeni2("    Dominik     Volavka     ")));
        System.out.println(Arrays.toString(parseCislaInt(new String("50;154;178"))));
        System.out.println(Arrays.toString(parseCislaDouble(    new String("50.15;154.165;178"))));
    }
}