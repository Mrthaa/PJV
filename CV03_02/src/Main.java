import Game.HraSachovniceRandom;

public class Main {
    public static void main(String[] args) {

        HraSachovniceRandom hra = new HraSachovniceRandom((byte)8, (byte)8);
        hra.execute();

        /*Game.HraSachovniceManual hra = new Game.HraSachovniceManual();
        hra.execute();*/
    }
}