public class Main {
    public static void main(String[] args) {
        Minesweeper ms = new Minesweeper(10, 10, 20);
        new MinesweeperGUI(ms);
    }
}