public class Main {
    public static void main(String[] args) {
        Nadrz nadrz = new Nadrz(Obsah.VODA, 200);
        try {
            System.out.println(nadrz);
            nadrz.empty(50);
            System.out.println(nadrz);
            nadrz.fill(100);
            System.out.println(nadrz);
            nadrz.fill(150);
            System.out.println(nadrz);
            System.out.println("pokracovalo to");
        } catch(MyException_PrazdnaNadrz|MyException_PlnaNadrz e) {
            e.printStackTrace();
        }

    }
}