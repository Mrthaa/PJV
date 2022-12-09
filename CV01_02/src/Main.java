public class Main {

    private static final byte BITS_IN_BYTE = 8;

    public static void main(String[] args) {
        typeTable();
        numVsString();
        TiskCislo((int) Math.floor(Math.random() * 100));
        ToASCII.print('a');
        ToASCII.printTableA();
        ToASCII.printTableB();
    }

    @SuppressWarnings("unused")
    private static void decVars() {
        byte a = (byte)12;
        short b = 1000;
        int c = 15000;
        long d = 15000L;
        float e = 15.25f;
        double f = 18.75;
        char g = 'a';
        boolean h = true;
    }

    private static void typeTable() {
        System.out.println("Type\tClass\tSize(b)\tSize(B)\n-----------------------------------------------------------------");
        System.out.printf("byte\tByte\t\t%d\t\t%d <%d,%d>\n", Byte.SIZE, Byte.SIZE/BITS_IN_BYTE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short\tShort\t\t%d\t\t%d <%d,%d>\n", Short.SIZE, Short.SIZE/BITS_IN_BYTE, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int\t\tInteger\t\t%d\t\t%d <%d,%d>\n", Integer.SIZE, Integer.SIZE/BITS_IN_BYTE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long\tLong\t\t%d\t\t%d <%d,%d>\n", Long.SIZE, Long.SIZE/BITS_IN_BYTE, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("float\tFloat\t\t%d\t\t%d <%s,%s>\n", Float.SIZE, Float.SIZE/BITS_IN_BYTE, Float.toString(Float.MIN_VALUE), Float.toString(Float.MAX_VALUE));
        System.out.printf("double\tDouble\t\t%d\t\t%d <%s,%s>\n", Double.SIZE, Double.SIZE/BITS_IN_BYTE, Double.toString(Double.MIN_VALUE), Double.toString(Double.MAX_VALUE));
        System.out.printf("char\tCharacter\t\t%d\t%d \n", Character.SIZE, Character.SIZE/BITS_IN_BYTE);
        System.out.printf("boolean\tBoolean\t\t%d\t\t%d \n", 8, Byte.SIZE/BITS_IN_BYTE);
    }

    private static void numVsString() {
        System.out.println(6 + 4);
        System.out.println("" + 6 + 4);
    }

    private static void TiskCislo(int num) {
        System.out.printf("Dec: %d\t Binary: %s\t Hex: %s\n",num, Integer.toBinaryString(num), Integer.toHexString(num));
    }
}