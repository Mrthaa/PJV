import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(kontrolaMnoziny(generujMnozina(10)));
        System.out.println(kontrolaMnoziny(new ArrayList<>(List.of(1, 2, 7, 5, 4, 3, 2))));
    }

    private static ArrayList<Integer> generujMnozina(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < n; i++) {
            int val = rand.nextInt(n*n);
            while(arr.contains(val)) val = rand.nextInt(n*n);
            arr.add(val);
        }
        return arr;
    }

    private static boolean kontrolaMnoziny(ArrayList<Integer> mn) {
        Set<Integer> set = new HashSet<>(mn);
        return set.size() == mn.size();
    }
}